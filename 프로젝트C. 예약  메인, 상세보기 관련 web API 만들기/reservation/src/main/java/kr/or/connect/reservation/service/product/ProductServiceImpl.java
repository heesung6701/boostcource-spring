package kr.or.connect.reservation.service.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.product.ProductDao;
import kr.or.connect.reservation.dto.product.ProductDto;

@Service
public class ProductServiceImpl implements ProductService {

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
