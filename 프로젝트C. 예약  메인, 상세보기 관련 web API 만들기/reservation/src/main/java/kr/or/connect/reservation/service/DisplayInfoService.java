package kr.or.connect.reservation.service;

import java.util.List;
import kr.or.connect.reservation.dto.ProductDto;

public interface DisplayInfoService {
  public List<ProductDto> selectAll(int start);
  public List<ProductDto> selectByCategoryId(int categoryId, int start);
  public int countByCategoryId(int categoryId);
  public int countAll();
}
