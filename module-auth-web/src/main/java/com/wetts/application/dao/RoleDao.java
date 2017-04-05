package com.wetts.application.dao;

import com.wetts.application.entity.Role;

import java.util.List;

/**
 * RoleDao
 *
 * @author wetts
 * @date 2016/08/07
 */
public interface RoleDao {

    public Role createRole(Role role);

    public Role updateRole(Role role);

    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);

    public List<Role> findAll();
}