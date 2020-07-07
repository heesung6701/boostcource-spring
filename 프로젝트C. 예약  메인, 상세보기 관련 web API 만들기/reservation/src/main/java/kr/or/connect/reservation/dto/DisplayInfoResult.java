package kr.or.connect.reservation.dto;

import java.util.List;

public class DisplayInfoResult {
  private ProductDto product;
  private List<ProductImageDto> productIamges;
  private List<DisplayInfoImageDto> displayInfoImages;
  private int avgScore;
  private List<ProductPriceDto> productPrices;

  public ProductDto getProduct() {
    return product;
  }

  public DisplayInfoResult setProduct(ProductDto product) {
    this.product = product;
    return this;
  }

  public List<ProductImageDto> getProductIamges() {
    return productIamges;
  }

  public DisplayInfoResult setProductIamges(List<ProductImageDto> productIamges) {
    this.productIamges = productIamges;
    return this;
  }

  public List<DisplayInfoImageDto> getDisplayInfoImages() {
    return displayInfoImages;
  }

  public DisplayInfoResult setDisplayInfoImages(List<DisplayInfoImageDto> displayInfoImages) {
    this.displayInfoImages = displayInfoImages;
    return this;
  }

  public int getAvgScore() {
    return avgScore;
  }

  public DisplayInfoResult setAvgScore(int avgScore) {
    this.avgScore = avgScore;
    return this;
  }

  public List<ProductPriceDto> getProductPrices() {
    return productPrices;
  }

  public DisplayInfoResult setProductPrices(List<ProductPriceDto> productPrices) {
    this.productPrices = productPrices;
    return this;
  }
}
