package kr.or.connect.reservation.service.category;

import java.util.List;
import kr.or.connect.reservation.dto.category.CategoryDto;

public interface CategoryService {
  public List<CategoryDto> selectAll();
}
