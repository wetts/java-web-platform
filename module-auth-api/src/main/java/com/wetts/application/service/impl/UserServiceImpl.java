package com.wetts.application.service.impl;

import com.wetts.application.dao.sys.UserDao;
import com.wetts.application.entity.sys.User;
import com.wetts.application.service.UserService;
import com.wetts.base.api.ErrorCode;
import com.wetts.base.api.exception.ApiException;
import com.wetts.base.shiro.Constants;
import com.wetts.base.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by wetts on 2017/4/5.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserDao userDao;

    @Override
    public String login(String username, String password) {
        User user = new User();
        user.setLoginName(username);
        user = userDao.getByLoginName(user);
        if (user == null) {
            throw new ApiException(ErrorCode.INVALID_USER);
        }

        String loginPassword = generateEncryptPassord(user.getEncrypt(), password);
        if (!StringUtils.equals(loginPassword, user.getPassword())) {
            throw new ApiException(ErrorCode.MISS_MATCH_PASSWORD);
        }

        String token = UUID.randomUUID().toString().trim().replaceAll("-", "");
        redisTemplate.opsForValue().set(Constants.USER_TOKEN_PERFIX + username, token);
        return token;
    }

    @Override
    public void logout(String username) {
        redisTemplate.delete(Constants.USER_TOKEN_PERFIX + username);
    }

    protected static String generateEncryptPassord(String encrypt, String password) {
        // 密码2次md5
        String md5Pwd = MD5Util.encrypt(password.trim());
        String md5PwdEncrypt = MD5Util.encrypt(md5Pwd + encrypt);
        return md5PwdEncrypt;
    }
}
