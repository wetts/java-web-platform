package com.wetts.auth.dao;

import com.wetts.auth.entity.User;

import java.util.List;

/**
 * UserDao
 *
 * @author wetts
 * @date 2016/08/07
 */
public interface UserDao {

    public User createUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}