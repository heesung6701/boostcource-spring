package kr.or.connect.reservation.service.category;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.category.CategoryDao;
import kr.or.connect.reservation.dto.category.CategoryDto;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  CategoryDao categoryDao;

  public List<CategoryDto> selectAll() {
    return categoryDao.selectAll();
  }
}
