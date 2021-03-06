package kr.or.connect.reservation.dao.displayinfo;

import static kr.or.connect.reservation.dao.displayinfo.DisplayInfoDaoSqls.COUNT_ALL;
import static kr.or.connect.reservation.dao.displayinfo.DisplayInfoDaoSqls.COUNT_BY_CATEGORY_ID;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DisplayInfoDao {

  private NamedParameterJdbcTemplate jdbc;

  public DisplayInfoDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public int countByCategoryId(int categoryId) {
    Map<String, Object> map = new HashMap<>();
    map.put("categoryId", categoryId);
    return jdbc.queryForObject(COUNT_BY_CATEGORY_ID, map, Integer.class);
  }

  public int countAll() {
    return jdbc.queryForObject(COUNT_ALL, Collections.emptyMap(), Integer.class);
  }
}
