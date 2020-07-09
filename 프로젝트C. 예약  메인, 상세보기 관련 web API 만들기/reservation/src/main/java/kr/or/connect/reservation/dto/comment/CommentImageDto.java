package kr.or.connect.reservation.dto.comment;

public class CommentImageDto {
  private int commentId;
  private int commentImageId;
  private String type;
  private int fileInfoId;
  private String fileName;
  private String saveFileName;
  private String contentType;
  private int deleteFlag;
  private String createDate;
  private String modifyDate;

  public int getCommentId() {
    return commentId;
  }

  public CommentImageDto setCommentId(int commentId) {
    this.commentId = commentId;
    return this;
  }

  public int getCommentImageId() {
    return commentImageId;
  }

  public CommentImageDto setCommentImageId(int commentImageId) {
    this.commentImageId = commentImageId;
    return this;
  }

  public String getType() {
    return type;
  }

  public CommentImageDto setType(String type) {
    this.type = type;
    return this;
  }

  public int getFileInfoId() {
    return fileInfoId;
  }

  public CommentImageDto setFileInfoId(int fileInfoId) {
    this.fileInfoId = fileInfoId;
    return this;
  }

  public String getFileName() {
    return fileName;
  }

  public CommentImageDto setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public String getSaveFileName() {
    return saveFileName;
  }

  public CommentImageDto setSaveFileName(String saveFileName) {
    this.saveFileName = saveFileName;
    return this;
  }

  public String getContentType() {
    return contentType;
  }

  public CommentImageDto setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public CommentImageDto setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
    return this;
  }

  public String getCreateDate() {
    return createDate;
  }

  public CommentImageDto setCreateDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public String getModifyDate() {
    return modifyDate;
  }

  public CommentImageDto setModifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
}
