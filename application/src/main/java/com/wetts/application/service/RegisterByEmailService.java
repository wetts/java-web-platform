package com.wetts.application.service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

/**
 * Created by wetts on 2017/3/14.
 */
public interface RegisterByEmailService {

    /**
     * 处理注册
     */
    void processRegister(HttpServletRequest request, String email);

    /**
     * 处理激活
     *
     * @throws ParseException
     */
    void processActivate(String email, String validateCode) throws ParseException;
}
