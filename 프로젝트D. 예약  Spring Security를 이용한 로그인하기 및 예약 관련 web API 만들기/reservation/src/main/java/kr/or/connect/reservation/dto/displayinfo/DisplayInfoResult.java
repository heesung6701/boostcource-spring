package kr.or.connect.reservation.dto.displayinfo;

import java.util.List;
import kr.or.connect.reservation.dto.product.ProductDto;
import kr.or.connect.reservation.dto.product.ProductImageDto;
import kr.or.connect.reservation.dto.product.ProductPriceDto;

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
