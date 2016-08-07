package com.wetts.auth.dao;

import com.wetts.auth.entity.Role;

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