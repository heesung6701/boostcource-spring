package kr.or.connect.reservation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.CategoryDao;
import kr.or.connect.reservation.dto.CategoryDto;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  CategoryDao categoryDao;

  public List<CategoryDto> selectAll() {
    return categoryDao.selectAll();
  }
}
