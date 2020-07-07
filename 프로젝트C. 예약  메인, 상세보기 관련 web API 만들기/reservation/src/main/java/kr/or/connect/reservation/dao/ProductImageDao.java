package kr.or.connect.reservation.dao;

import static kr.or.connect.reservation.dao.ProductImageDalSqls.SELECT_BY_DISPLAY_INFO_ID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.ProductImageDto;

@Repository
public class ProductImageDao {
  
  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<ProductImageDto> rowMapper = BeanPropertyRowMapper.newInstance(ProductImageDto.class);

  public ProductImageDao(DataSource dataSource){
      this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }
  
  public List<ProductImageDto> selectList(int displayInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("displayInfoId", displayInfoId);
    return jdbc.query(SELECT_BY_DISPLAY_INFO_ID, map, rowMapper);
  }
}
