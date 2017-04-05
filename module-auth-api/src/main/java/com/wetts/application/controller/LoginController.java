package com.wetts.application.controller;

import com.wetts.application.service.UserService;
import com.wetts.base.api.ApiResultUtils;
import com.wetts.base.api.BaseResultVo;
import com.wetts.base.api.ErrorCode;
import com.wetts.base.api.exception.ApiException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wetts on 2017/4/5.
 */
@RestController
@RequestMapping("/api/user")
@Api(value = "/api/user", description = "用户相关")
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录", httpMethod = "POST", notes = "参数以json形式传递", response = BaseResultVo.class)
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    @ResponseBody
    public BaseResultVo login(@ApiParam(required = true) @RequestParam(required = true) String account,
                              @ApiParam(required = true) @RequestParam(required = true) String password,
                              HttpServletRequest request, HttpServletResponse response) {
        try {
            if (StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {
                throw new ApiException(ErrorCode.LACK_OF_PARAM);
            }

            Map result = new HashMap();
            result.put("token", userService.login(account, password));

            return ApiResultUtils.buildSuccessResultInfo(result);
        } catch (ApiException e) {
            return ApiResultUtils.buildFailedResultInfo(e.getErrorCode());
        } catch (Exception e) {
            return ApiResultUtils.buildFailedResultInfo(ErrorCode.SYSTEM_ERROR);
        }
    }

    @ApiOperation(value = "登出", httpMethod = "POST", notes = "参数以json形式传递", response = BaseResultVo.class)
    @RequestMapping(value = "/logout")
    @ResponseBody
    private BaseResultVo logout(@ApiParam(required = true) @RequestParam(required = true) String account) {
        try {
            if (StringUtils.isEmpty(account)) {
                throw new ApiException(ErrorCode.LACK_OF_PARAM);
            }

            userService.logout(account);

            return ApiResultUtils.buildSuccessResultInfo();
        } catch (ApiException e) {
            return ApiResultUtils.buildFailedResultInfo(e.getErrorCode());
        } catch (Exception e) {
            return ApiResultUtils.buildFailedResultInfo(ErrorCode.SYSTEM_ERROR);
        }
    }
}
