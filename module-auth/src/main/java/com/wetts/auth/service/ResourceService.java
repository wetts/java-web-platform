package com.wetts.auth.service;

import com.wetts.auth.entity.Resource;

import java.util.List;
import java.util.Set;

/**
 * ResourceService
 *
 * @author wetts
 * @date 2016/08/07
 */
public interface ResourceService {

    public Resource createResource(Resource resource);

    public Resource updateResource(Resource resource);

    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);

    List<Resource> findAll();

    /**
     * 得到资源对应的权限字符串
     *
     * @param resourceIds
     * @return
     */
    Set<String> findPermissions(Set<Long> resourceIds);

    /**
     * 根据用户权限得到菜单
     *
     * @param permissions
     * @return
     */
    List<Resource> findMenus(Set<String> permissions);
}