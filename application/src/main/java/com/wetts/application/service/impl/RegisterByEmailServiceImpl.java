package com.wetts.application.service.impl;

import com.wetts.application.service.RegisterByEmailService;
import com.wetts.base.utils.SendEmailUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

/**
 * Created by wetts on 2017/3/14.
 */
public class RegisterByEmailServiceImpl implements RegisterByEmailService {


    /**
     * 处理注册
     */
    public void processRegister(HttpServletRequest request, String email) {
        StringBuffer sb = new StringBuffer("点击下面链接激活账号，48小时生效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
        sb.append("<a href=\"");
        sb.append(request.getRequestURI());
        sb.append("/user/register?action=activate&email=");
        sb.append(email);
        sb.append("&validateCode=");
//        sb.append(user.getValidateCode());
        sb.append("\">");
        sb.append(request.getRequestURI());
        sb.append("/user/register?action=activate&email=");
        sb.append(email);
        sb.append("&validateCode=");
//        sb.append(user.getValidateCode());
        sb.append("</a>");

        //发送邮件
        SendEmailUtil.sendEmailBySSL(email, "注册邮件", sb.toString());
    }

    /**
     * 处理激活
     *
     * @throws ParseException
     */
    ///传递激活码和email过来
    public void processActivate(String email, String validateCode) throws ParseException {
        //数据访问层，通过email获取用户信息
//        UserModel user=userDao.find(email);
//        //验证用户是否存在
//        if(user!=null) {
//            //验证用户激活状态
//            if(user.getStatus()==0) {
//                ///没激活
//                Date currentTime = new Date();//获取当前时间
//                //验证链接是否过期
//                currentTime.before(user.getRegisterTime());
//                if(currentTime.before(user.getLastActivateTime())) {
//                    //验证激活码是否正确
//                    if(validateCode.equals(user.getValidateCode())) {
//                        //激活成功， //并更新用户的激活状态，为已激活
//                        System.out.println("==sq==="+user.getStatus());
//                        user.setStatus(1);//把状态改为激活
//                        System.out.println("==sh==="+user.getStatus());
//                        userDao.update(user);
//                    } else {
//                        throw new ServiceException("激活码不正确");
//                    }
//                } else { throw new ServiceException("激活码已过期！");
//                }
//            } else {
//                throw new ServiceException("邮箱已激活，请登录！");
//            }
//        } else {
//            throw new ServiceException("该邮箱未注册（邮箱地址不存在）！");
//        }

    }
}
