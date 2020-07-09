package kr.or.connect.reservation.dto.comment;

import java.util.List;

public class CommentDto {
  private int id;
  private int productId;
  private int reservationInfoId;
  private int score;
  private String reservationEmail;
  private String comment;
  private String createDate;
  private String modifyDate;
  private List<CommentImageDto> reservationUserCommentImages;

  public int getId() {
    return id;
  }

  public CommentDto setId(int id) {
    this.id = id;
    return this;
  }

  public int getProductId() {
    return productId;
  }

  public CommentDto setProductId(int productId) {
    this.productId = productId;
    return this;
  }

  public int getReservationInfoId() {
    return reservationInfoId;
  }

  public CommentDto setReservationInfoId(int reservationInfoId) {
    this.reservationInfoId = reservationInfoId;
    return this;
  }

  public int getScore() {
    return score;
  }

  public CommentDto setScore(int score) {
    this.score = score;
    return this;
  }

  public String getReservationEmail() {
    return reservationEmail;
  }

  public CommentDto setReservationEmail(String reservationEmail) {
    this.reservationEmail = reservationEmail;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CommentDto setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getCreateDate() {
    return createDate;
  }

  public CommentDto setCreateDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public String getModifyDate() {
    return modifyDate;
  }

  public CommentDto setModifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

  public List<CommentImageDto> getReservationUserCommentImages() {
    return reservationUserCommentImages;
  }

  public CommentDto setReservationUserCommentImages(
      List<CommentImageDto> reservationUserCommentImages) {
    this.reservationUserCommentImages = reservationUserCommentImages;
    return this;
  }
}
