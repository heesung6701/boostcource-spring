package kr.or.connect.reservation.dto;

import java.util.List;

public class DisplayInfoListResult {

  private int totalCount;
  private int productCount;
  private List<DisplayInfoDto> products;
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
  public List<DisplayInfoDto> getProducts() {
    return products;
  }
  public DisplayInfoListResult setProducts(List<DisplayInfoDto> products) {
    this.products = products;
    return this;
  }
  
}
