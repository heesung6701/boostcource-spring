package kr.or.connect.reservation.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.DisplayInfoImageDto;

import static kr.or.connect.reservation.dao.DisplayInfoImageDaoSqls.SELECT_BY_DISPLAY_INFO_ID;

@Repository
public class DisplayInfoImageDao {
  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<DisplayInfoImageDto> rowMapper =
      BeanPropertyRowMapper.newInstance(DisplayInfoImageDto.class);

  public DisplayInfoImageDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public List<DisplayInfoImageDto> selectByDisplayInfoId(int displayInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("displayInfoId", displayInfoId);
    return jdbc.query(SELECT_BY_DISPLAY_INFO_ID, map, rowMapper);
  }
}
