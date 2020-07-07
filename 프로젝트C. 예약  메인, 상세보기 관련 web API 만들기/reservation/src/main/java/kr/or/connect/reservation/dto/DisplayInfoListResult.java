package kr.or.connect.reservation.dto;

import java.util.List;

public class DisplayInfoListResult {

  private int totalCount;
  private int productCount;
  private List<ProductDto> products;
  public int getTotalCount() {
    return totalCount;
  }
  public DisplayInfoListResult setTotalCount(int totalCount) {
    this.totalCount = totalCount;
    return this;
  }
  public int getProductCount() {
    return productCount;
  }
  public DisplayInfoListResult setProductCount(int productCount) {
    this.productCount = productCount;
    return this;
  }
  public List<ProductDto> getProducts() {
    return products;
  }
  public DisplayInfoListResult setProducts(List<ProductDto> products) {
    this.products = products;
    return this;
  }
  
}
