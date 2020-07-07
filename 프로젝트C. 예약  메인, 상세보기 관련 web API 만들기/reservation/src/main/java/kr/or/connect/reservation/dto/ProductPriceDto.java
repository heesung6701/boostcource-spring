package kr.or.connect.reservation.dto;

public class ProductPriceDto {
  private int id;
  private int productId;
  private String priceTypeName;
  private int price;
  private int discountRate;
  private String createDate;
  private String modifyDate;

  public int getId() {
    return id;
  }

  public ProductPriceDto setId(int id) {
    this.id = id;
    return this;
  }

  public int getProductId() {
    return productId;
  }

  public ProductPriceDto setProductId(int productId) {
    this.productId = productId;
    return this;
  }

  public String getPriceTypeName() {
    return priceTypeName;
  }

  public ProductPriceDto setPriceTypeName(String priceTypeName) {
    this.priceTypeName = priceTypeName;
    return this;
  }

  public int getPrice() {
    return price;
  }

  public ProductPriceDto setPrice(int price) {
    this.price = price;
    return this;
  }

  public int getDiscountRate() {
    return discountRate;
  }

  public ProductPriceDto setDiscountRate(int discountRate) {
    this.discountRate = discountRate;
    return this;
  }

  public String getCreateDate() {
    return createDate;
  }

  public ProductPriceDto setCreateDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public String getModifyDate() {
    return modifyDate;
  }

  public ProductPriceDto setModifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
}
