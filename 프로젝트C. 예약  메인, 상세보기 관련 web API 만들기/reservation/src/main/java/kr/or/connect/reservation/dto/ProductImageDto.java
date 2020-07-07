package kr.or.connect.reservation.dto;

public class ProductImageDto {
  private int productId;
  private int productImageId;
  private String type;
  private int fileInfoId;
  private String fileName;
  private String saveFileName;
  private String contentType;
  private int deleteFlag;
  private String createDate;
  private String modifyDate;
  public int getProductId() {
    return productId;
  }
  public ProductImageDto setProductId(int productId) {
    this.productId = productId;
    return this;
  }
  public int getProductImageId() {
    return productImageId;
  }
  public ProductImageDto setProductImageId(int productImageId) {
    this.productImageId = productImageId;
    return this;
  }
  public String getType() {
    return type;
  }
  public ProductImageDto setType(String type) {
    this.type = type;
    return this;
  }
  public int getFileInfoId() {
    return fileInfoId;
  }
  public ProductImageDto setFileInfoId(int fileInfoId) {
    this.fileInfoId = fileInfoId;
    return this;
  }
  public String getFileName() {
    return fileName;
  }
  public ProductImageDto setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  public String getSaveFileName() {
    return saveFileName;
  }
  public ProductImageDto setSaveFileName(String saveFileName) {
    this.saveFileName = saveFileName;
    return this;
  }
  public String getContentType() {
    return contentType;
  }
  public ProductImageDto setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  public int getDeleteFlag() {
    return deleteFlag;
  }
  public ProductImageDto setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
    return this;
  }
  public String getCreateDate() {
    return createDate;
  }
  public ProductImageDto setCreateDate(String createDate) {
    this.createDate = createDate;
    return this;
  }
  public String getModifyDate() {
    return modifyDate;
  }
  public ProductImageDto setModifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
}
