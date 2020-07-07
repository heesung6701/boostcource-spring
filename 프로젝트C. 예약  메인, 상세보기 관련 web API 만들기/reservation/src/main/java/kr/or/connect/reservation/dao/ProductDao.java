package kr.or.connect.reservation.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.ProductDto;
import kr.or.connect.reservation.dto.ProductImageDto;
import static kr.or.connect.reservation.dao.ProductDaoSqls.SELECT_ALL;
import static kr.or.connect.reservation.dao.ProductDaoSqls.SELECT_BY_ID;
import static kr.or.connect.reservation.dao.ProductDaoSqls.SELECT_BY_CATEGORY_ID;

@Repository
public class ProductDao {
  
  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<ProductDto> rowMapper = BeanPropertyRowMapper.newInstance(ProductDto.class);

  public ProductDao(DataSource dataSource){
      this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public List<ProductDto> selectAll(int start) {
    Map<String, Object> map = new HashMap<>();
    map.put("start", start);
    return jdbc.query(SELECT_ALL, map, rowMapper);  
  }
  
  public List<ProductDto> selectByCategoryId(int categoryId, int start) {
    Map<String, Object> map = new HashMap<>();
    map.put("categoryId", categoryId);
    map.put("start", start);
    return jdbc.query(SELECT_BY_CATEGORY_ID, map, rowMapper);  
  }
  
  public ProductDto select(int displayInfoId) {
    Map<String, Object> map = new HashMap<>();
    map.put("displayInfoId", displayInfoId);
    List<ProductDto> result = jdbc.query(SELECT_BY_ID, map, rowMapper);
    if(result.size() == 0) return null;
    return result.get(0);
  }
}
