package com.wetts.application.service;

import com.wetts.application.entity.Organization;

import java.util.List;

/**
 * OrganizationService
 *
 * @author wetts
 * @date 2016/08/07
 */
public interface OrganizationService {

    public Organization createOrganization(Organization organization);

    public Organization updateOrganization(Organization organization);

    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);

    List<Organization> findAll();

    Object findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}