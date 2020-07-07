package kr.or.connect.reservation.dto;

public class DisplayInfoImageDto {
  private int id;
  private int displayInfoId;
  private int fileId;
  private String fileName;
  private String saveFileName;
  private String contentType;
  private int deleteFlag;
  private String createDate;
  private String modifyDate;
  
  public int getId() {
    return id;
  }
  public DisplayInfoImageDto setId(int id) {
    this.id = id;
    return this;
  }
  public int getDisplayInfoId() {
    return displayInfoId;
  }
  public DisplayInfoImageDto setDisplayInfoId(int displayInfoId) {
    this.displayInfoId = displayInfoId;
    return this;
  }
  public int getFileId() {
    return fileId;
  }
  public DisplayInfoImageDto setFileId(int fileId) {
    this.fileId = fileId;
    return this;
  }
  public String getFileName() {
    return fileName;
  }
  public DisplayInfoImageDto setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  public String getSaveFileName() {
    return saveFileName;
  }
  public DisplayInfoImageDto setSaveFileName(String saveFileName) {
    this.saveFileName = saveFileName;
    return this;
  }
  public String getContentType() {
    return contentType;
  }
  public DisplayInfoImageDto setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  public int getDeleteFlag() {
    return deleteFlag;
  }
  public DisplayInfoImageDto setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
    return this;
  }
  public String getCreateDate() {
    return createDate;
  }
  public DisplayInfoImageDto setCreateDate(String createDate) {
    this.createDate = createDate;
    return this;
  }
  public String getModifyDate() {
    return modifyDate;
  }
  public DisplayInfoImageDto setModifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
}
