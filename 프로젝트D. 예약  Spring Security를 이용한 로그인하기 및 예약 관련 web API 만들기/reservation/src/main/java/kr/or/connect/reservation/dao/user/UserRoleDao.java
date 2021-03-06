package kr.or.connect.reservation.dao.user;

import java.util.*;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.user.UserRole;
import static kr.or.connect.reservation.dao.user.UserRoleDaoSqls.SELECT_ALL_BY_EMAIL;

@Repository
public class UserRoleDao {
  private NamedParameterJdbcTemplate jdbc;
  private SimpleJdbcInsert insertAction;
  private RowMapper<UserRole> rowMapper = BeanPropertyRowMapper.newInstance(UserRole.class);

  public UserRoleDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    this.insertAction =
        new SimpleJdbcInsert(dataSource).withTableName("user_role").usingGeneratedKeyColumns("id");
  }

  public List<UserRole> getRolesByEmail(String email) {
    Map<String, Object> map = new HashMap<>();
    map.put("email", email);

    return jdbc.query(SELECT_ALL_BY_EMAIL, map, rowMapper);
  }
  
  public long addUserRole(UserRole userRole) {
    SqlParameterSource params = new BeanPropertySqlParameterSource(userRole);
    return insertAction.executeAndReturnKey(params).longValue();
  }
}
