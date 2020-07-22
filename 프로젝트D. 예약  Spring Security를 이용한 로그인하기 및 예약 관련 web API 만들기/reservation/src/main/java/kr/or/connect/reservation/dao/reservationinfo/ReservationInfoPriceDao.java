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
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoPriceEntity;

import static kr.or.connect.reservation.dao.reservationinfo.ReservationInfoPriceDaoSqls.SELECT_BY_RESERVATION_INFO_ID;
import static kr.or.connect.reservation.dao.reservationinfo.ReservationInfoPriceDaoSqls.DELETE_BY_RESERVATION_INFO_ID;

@Repository
public class ReservationInfoPriceDao {
  
  private NamedParameterJdbcTemplate jdbc;
  private SimpleJdbcInsert insertAction;
  private RowMapper<ReservationInfoPriceEntity> rowMapper = BeanPropertyRowMapper.newInstance(ReservationInfoPriceEntity.class);

  public ReservationInfoPriceDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    this.insertAction =
        new SimpleJdbcInsert(dataSource).withTableName("reservation_info_price").usingGeneratedKeyColumns("id");
  }

  public long insert(ReservationInfoPriceEntity reservationInfoPriceDto) {
    SqlParameterSource params = new BeanPropertySqlParameterSource(reservationInfoPriceDto);
    return insertAction.executeAndReturnKey(params).longValue();
  }
  
  public List<ReservationInfoPriceEntity> selectByReservaionInfoId(long reservationInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("reservationInfoId", reservationInfoId);
    return jdbc.query(SELECT_BY_RESERVATION_INFO_ID, map, rowMapper);
  }
  
  public long deleteByReservationInfoId(long reservationInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("reservationInfoId", reservationInfoId);
    return jdbc.update(DELETE_BY_RESERVATION_INFO_ID, map);
  }
}
