package kr.or.connect.reservation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import kr.or.connect.reservation.dao.ProductDao;
import kr.or.connect.reservation.dto.ProductDto;

public class ProductServiceImpl implements ProductService{

  @Autowired
  ProductDao productDao;

  @Override
  public List<ProductDto> selectAll(int start) {
    return productDao.selectAll(start);
  }

  @Override
  public List<ProductDto> selectByCategoryId(int categoryId, int start) {
    return productDao.selectByCategoryId(categoryId, start);
  }  
}
