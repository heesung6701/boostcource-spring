package kr.or.connect.reservation.dao.comment;

import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.comment.CommentDto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static kr.or.connect.reservation.dao.comment.CommentDaoSqls.AVERAGE_SCORE_BY_DISPLAY_INFO_ID;
import static kr.or.connect.reservation.dao.comment.CommentDaoSqls.SELECT_BY_PRODUCT_ID;;

@Repository
public class CommentDao {

  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<CommentDto> rowMapper = BeanPropertyRowMapper.newInstance(CommentDto.class);
  
  public CommentDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public int getAverageScoreByDisplayInfoId(int displayInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("displayInfoId", displayInfoId);
    return jdbc.queryForObject(AVERAGE_SCORE_BY_DISPLAY_INFO_ID, map, Integer.class);
  }
  
  public List<CommentDto> selectByProductId(int productId, int start) {
    Map<String, Object> map = new HashMap<>();
    map.put("productId", productId);
    map.put("start", start);
    return jdbc.query(SELECT_BY_PRODUCT_ID, map, rowMapper);
  }
}
