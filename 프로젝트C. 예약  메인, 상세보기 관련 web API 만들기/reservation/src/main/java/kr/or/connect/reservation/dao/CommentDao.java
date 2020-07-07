package kr.or.connect.reservation.dao;

import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import static kr.or.connect.reservation.dao.CommentDaoSqls.AVERAGE_SCORE_BY_DISPLAY_INFO_ID;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CommentDao {

  private NamedParameterJdbcTemplate jdbc;

  public CommentDao(DataSource dataSource){
      this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }
  
  public int getAverageScoreByDisplayInfoId(int displayInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("displayInfoId", displayInfoId);
    return jdbc.queryForObject(AVERAGE_SCORE_BY_DISPLAY_INFO_ID, map, Integer.class);
  }
}
