package kr.or.connect.reservation.dto;

public class PromotionDto {
  private int id;
  private int productId;
  private int categoryId;
  private String categoryName;
  private String description;
  private int fildId;

  public int getId() {
    return id;
  }

  public PromotionDto setId(int id) {
    this.id = id;
    return this;
  }

  public int getProductId() {
    return productId;
  }

  public PromotionDto setProductId(int productId) {
    this.productId = productId;
    return this;
  }

  public int getCategoryId() {
    return categoryId;
  }

  public PromotionDto setCategoryId(int categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public PromotionDto setCategoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PromotionDto setDescription(String description) {
    this.description = description;
    return this;
  }

  public int getFildId() {
    return fildId;
  }

  public PromotionDto setFildId(int fildId) {
    this.fildId = fildId;
    return this;
  }
}
