package kr.or.connect.reservation.dao;

import static kr.or.connect.reservation.dao.CategoryDaoSqls.SELECT_ALL;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.or.connect.reservation.dto.CategoryDto;

@Repository
public class CategoryDao {

  private NamedParameterJdbcTemplate jdbc;
  private RowMapper<CategoryDto> rowMapper = BeanPropertyRowMapper.newInstance(CategoryDto.class);

  public CategoryDao(DataSource dataSource) {
    this.jdbc = new NamedParameterJdbcTemplate(dataSource);
  }

  public List<CategoryDto> selectAll() {
    return jdbc.query(SELECT_ALL, rowMapper);
  }
}
