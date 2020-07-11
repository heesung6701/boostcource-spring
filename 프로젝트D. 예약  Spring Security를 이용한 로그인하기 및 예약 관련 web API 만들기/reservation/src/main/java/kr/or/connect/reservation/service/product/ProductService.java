package kr.or.connect.reservation.service.product;

import java.util.List;
import kr.or.connect.reservation.dto.product.ProductDto;

public interface ProductService {
  public List<ProductDto> selectAll(int start);

  public List<ProductDto> selectByCategoryId(int categoryId, int start);
}
