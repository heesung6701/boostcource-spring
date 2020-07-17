package kr.or.connect.reservation.dao.user;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.user.User;

import static kr.or.connect.reservation.dao.user.UserDaoSqls.SELECT_ALL_BY_EMAIL;

@Repository
public class UserDao {
  private NamedParameterJdbcTemplate jdbc;
  private SimpleJdbcInsert insertAction;
  private RowMapper<User> rowMapper = BeanPropertyRowMapper.newInstance(User.class);

  public UserDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    this.insertAction =
        new SimpleJdbcInsert(dataSource).withTableName("user").usingGeneratedKeyColumns("id");
  }

  public User getUserByEmail(String email) {
    Map<String, Object> map = new HashMap<>();
    map.put("email", email);

    return jdbc.queryForObject(SELECT_ALL_BY_EMAIL, map, rowMapper);
  }

  public long addUser(User user) {
    SqlParameterSource params = new BeanPropertySqlParameterSource(user);
    return insertAction.executeAndReturnKey(params).longValue();
  }
}
