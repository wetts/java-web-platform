package com.wetts.application.dao;

import com.wetts.application.entity.Organization;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * OrganizationDaoImpl
 *
 * @author wetts
 * @date 2016/08/07
 */
@Repository
public class OrganizationDaoImpl implements OrganizationDao {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public Organization createOrganization(final Organization organization) {
//        final String sql = "insert into sys_organization( name, parent_id, parent_ids, available) values(?,?,?,?)";
//
//        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(new PreparedStatementCreator() {
//            @Override
//            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//                PreparedStatement psst = connection.prepareStatement(sql, new String[]{"id"});
//                int count = 1;
//                psst.setString(count++, organization.getName());
//                psst.setLong(count++, organization.getParentId());
//                psst.setString(count++, organization.getParentIds());
//                psst.setBoolean(count++, organization.getAvailable());
//                return psst;
//            }
//        }, keyHolder);
//        organization.setId(keyHolder.getKey().longValue());
        return organization;
    }

    @Override
    public Organization updateOrganization(Organization organization) {
//        final String sql = "update sys_organization set name=?, parent_id=?, parent_ids=?, available=? where id=?";
//        jdbcTemplate.update(
//                sql,
//                organization.getName(), organization.getParentId(), organization.getParentIds(), organization.getAvailable(), organization.getId());
        return organization;
    }

    public void deleteOrganization(Long organizationId) {
//        Organization organization = findOne(organizationId);
//        final String deleteSelfSql = "delete from sys_organization where id=?";
//        jdbcTemplate.update(deleteSelfSql, organizationId);
//        final String deleteDescendantsSql = "delete from sys_organization where parent_ids like ?";
//        jdbcTemplate.update(deleteDescendantsSql, organization.makeSelfAsParentIds() + "%");
    }


    @Override
    public Organization findOne(Long organizationId) {
//        final String sql = "select id, name, parent_id, parent_ids, available from sys_organization where id=?";
//        List<Organization> organizationList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Organization.class), organizationId);
//        if(organizationList.size() == 0) {
//            return null;
//        }
//        return organizationList.get(0);
        return new Organization();
    }

    @Override
    public List<Organization> findAll() {
//        final String sql = "select id, name, parent_id, parent_ids, available from sys_organization";
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Organization.class));
        return new ArrayList<Organization>();
    }

    @Override
    public List<Organization> findAllWithExclude(Organization excludeOraganization) {
        //TODO 改成not exists 利用索引
//        final String sql = "select id, name, parent_id, parent_ids, available from sys_organization where id!=? and parent_ids not like ?";
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Organization.class), excludeOraganization.getId(), excludeOraganization.makeSelfAsParentIds() + "%");
        return new ArrayList<Organization>();
    }

    @Override
    public void move(Organization source, Organization target) {
//        String moveSourceSql = "update sys_organization set parent_id=?,parent_ids=? where id=?";
//        jdbcTemplate.update(moveSourceSql, target.getId(), target.getParentIds(), source.getId());
//        String moveSourceDescendantsSql = "update sys_organization set parent_ids=concat(?, substring(parent_ids, length(?))) where parent_ids like ?";
//        jdbcTemplate.update(moveSourceDescendantsSql, target.makeSelfAsParentIds(), source.makeSelfAsParentIds(), source.makeSelfAsParentIds() + "%");
    }
}