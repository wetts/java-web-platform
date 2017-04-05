package com.wetts.application.dao;

import com.wetts.application.entity.Organization;

import java.util.List;

/**
 * OrganizationDao
 *
 * @author wetts
 * @date 2016/08/07
 */
public interface OrganizationDao {

    public Organization createOrganization(Organization organization);

    public Organization updateOrganization(Organization organization);

    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);

    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}