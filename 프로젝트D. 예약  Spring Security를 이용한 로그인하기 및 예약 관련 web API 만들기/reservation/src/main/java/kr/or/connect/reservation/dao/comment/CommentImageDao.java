package kr.or.connect.reservation.dao.comment;

import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.comment.CommentImageDto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static kr.or.connect.reservation.dao.comment.CommentImageDaoSqls.SELECT_BY_COMMENT_ID;

@Repository
public class CommentImageDao {

  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<CommentImageDto> rowMapper = BeanPropertyRowMapper.newInstance(CommentImageDto.class);
  
  public CommentImageDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public List<CommentImageDto> selectByCommentId(int commentId) {
    Map<String, Object> map = new HashMap<>();
    map.put("commentId", commentId);
    return jdbc.query(SELECT_BY_COMMENT_ID, map, rowMapper);
  }
}
