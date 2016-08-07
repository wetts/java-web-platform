package com.wetts.auth.dao;

import com.wetts.auth.entity.Resource;

import java.util.List;

/**
 * ResourceDao
 *
 * @author wetts
 * @date 2016/08/07
 */
public interface ResourceDao {

    public Resource createResource(Resource resource);

    public Resource updateResource(Resource resource);

    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);

    List<Resource> findAll();

}