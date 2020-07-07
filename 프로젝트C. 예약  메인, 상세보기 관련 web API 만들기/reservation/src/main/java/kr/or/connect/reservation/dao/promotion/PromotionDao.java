package kr.or.connect.reservation.dao.promotion;

import static kr.or.connect.reservation.dao.promotion.PromotionDaoSqls.SELECT_ALL;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.promotion.PromotionDto;

@Repository
public class PromotionDao {

  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<PromotionDto> rowMapper = BeanPropertyRowMapper.newInstance(PromotionDto.class);

  public PromotionDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public List<PromotionDto> selectAll() {
    return jdbc.query(SELECT_ALL, rowMapper);
  }
}
