package com.wetts.application.dao;

import com.wetts.application.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * RoleDaoImpl
 *
 * @author wetts
 * @date 2016/08/07
 */
@Repository
public class RoleDaoImpl implements RoleDao {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public Role createRole(final Role role) {
//        final String sql = "insert into sys_role(role, description, resource_ids, available) values(?,?,?,?)";
//
//        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(new PreparedStatementCreator() {
//            @Override
//            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//                PreparedStatement psst = connection.prepareStatement(sql, new String[]{"id"});
//                int count = 1;
//                psst.setString(count++, role.getRole());
//                psst.setString(count++, role.getDescription());
//                psst.setString(count++, role.getResourceIdsStr());
//                psst.setBoolean(count++, role.getAvailable());
//                return psst;
//            }
//        }, keyHolder);
//        role.setId(keyHolder.getKey().longValue());
        return role;
    }

    @Override
    public Role updateRole(Role role) {
//        final String sql = "update sys_role set role=?, description=?, resource_ids=?, available=? where id=?";
//        jdbcTemplate.update(
//                sql,
//                role.getRole(), role.getDescription(), role.getResourceIdsStr(), role.getAvailable(), role.getId());
        return role;
    }

    public void deleteRole(Long roleId) {
//        final String sql = "delete from sys_role where id=?";
//        jdbcTemplate.update(sql, roleId);
    }


    @Override
    public Role findOne(Long roleId) {
//        final String sql = "select id, role, description, resource_ids as resourceIdsStr, available from sys_role where id=?";
//        List<Role> roleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Role.class), roleId);
//        if (roleList.size() == 0) {
//            return null;
//        }
//        return roleList.get(0);
        Role r = new Role();
        r.setRole("admin");
        r.setId(1l);
        List<Long> rs = new ArrayList<>();
        rs.add(1l);
        r.setResourceIds(rs);
        return r;
    }

    @Override
    public List<Role> findAll() {
//        final String sql = "select id, role, description, resource_ids as resourceIdsStr, available from sys_role";
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Role.class));
        return new ArrayList<Role>();
    }

}