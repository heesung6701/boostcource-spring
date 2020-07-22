package kr.or.connect.reservation.dao.reservationinfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoEntity;

import static kr.or.connect.reservation.dao.reservationinfo.ReservationInfoDaoSqls.SELECT_BY_ID;
import static kr.or.connect.reservation.dao.reservationinfo.ReservationInfoDaoSqls.SELECT_BY_USER_ID;
import static kr.or.connect.reservation.dao.reservationinfo.ReservationInfoDaoSqls.DELETE_BY_ID;

@Repository
public class ReservationInfoDao {
  
  private NamedParameterJdbcTemplate jdbc;
  private SimpleJdbcInsert insertAction;
  private RowMapper<ReservationInfoEntity> rowMapper = BeanPropertyRowMapper.newInstance(ReservationInfoEntity.class);

  public ReservationInfoDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    this.insertAction =
        new SimpleJdbcInsert(dataSource).withTableName("reservation_info").usingGeneratedKeyColumns("id");
  }
  
  public long insert(ReservationInfoEntity reservationInfoDto) {
    SqlParameterSource params = new BeanPropertySqlParameterSource(reservationInfoDto);
    return insertAction.executeAndReturnKey(params).longValue();
  }
  
  public ReservationInfoEntity selectById(long id) {
    Map<String, Object> map = new HashMap<>();
    map.put("id", id);
    return jdbc.queryForObject(SELECT_BY_ID, map, rowMapper);
  }

  public List<ReservationInfoEntity> selectByUserId(long userId) {
    Map<String, Object> map = new HashMap<>();
    map.put("userId", userId);
    return jdbc.query(SELECT_BY_USER_ID, map, rowMapper);
  }

  public long deleteById(long reservationInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("reservationInfoId", reservationInfoId);
    return jdbc.update(DELETE_BY_ID, map);
  }
}
