package kr.or.connect.reservation.dao;

import static kr.or.connect.reservation.dao.DisplayInfoDaoSqls.SELECT_ALL;
import static kr.or.connect.reservation.dao.DisplayInfoDaoSqls.SELECT_BY_CATEGORY_ID;
import static kr.or.connect.reservation.dao.DisplayInfoDaoSqls.COUNT_BY_CATEGORY_ID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.DisplayInfoDto;

@Repository
public class DisplayInfoDao {
  
  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<DisplayInfoDto> rowMapper = BeanPropertyRowMapper.newInstance(DisplayInfoDto.class);

  public DisplayInfoDao(DataSource dataSource){
      this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public List<DisplayInfoDto> selectAll(int start) {
    Map<String, Object> map = new HashMap<>();
    map.put("start", start);
    return jdbc.query(SELECT_ALL, map, rowMapper);  
  }
  
  public List<DisplayInfoDto> selectByCategoryId(int categoryId, int start) {
    Map<String, Object> map = new HashMap<>();
    map.put("categoryId", categoryId);
    map.put("start", start);
    return jdbc.query(SELECT_BY_CATEGORY_ID, map, rowMapper);  
  }

  public int countByCategoryId(int categoryId) {
    Map<String, Object> map = new HashMap<>();
    map.put("categoryId", categoryId);
    return jdbc.queryForObject(COUNT_BY_CATEGORY_ID, map, Integer.class);
  }
}