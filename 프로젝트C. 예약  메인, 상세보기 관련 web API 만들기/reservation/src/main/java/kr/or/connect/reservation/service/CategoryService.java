package kr.or.connect.reservation.service;

import java.util.List;
import kr.or.connect.reservation.dto.CategoryDto;

public interface CategoryService {
  public List<CategoryDto> selectAll();
}
