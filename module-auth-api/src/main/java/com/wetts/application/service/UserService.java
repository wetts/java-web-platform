package com.wetts.application.service;

/**
 * Created by wetts on 2017/4/5.
 */
public interface UserService {

    String login(String username, String password);

    void logout(String username);
}
