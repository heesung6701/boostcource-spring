package kr.or.connect.reservation.dto.reservationinfo;

import java.util.Date;

public class ReservationInfoDto {
  private int id;
  private int productId;
  private int displayInfoId;
  private int userId;
  private Date reservationDate;
  private int cancelFlag;
  private Date createDate;
  private Date modifyDate;
  
  public ReservationInfoDto() {
    this.createDate = new Date();
    this.modifyDate = new Date();
  }
  
  public int getId() {
    return id;
  }
  public ReservationInfoDto setId(int id) {
    this.id = id;
    return this;
  }
  public int getProductId() {
    return productId;
  }
  public ReservationInfoDto setProductId(int productId) {
    this.productId = productId;
    return this;
  }
  public int getDisplayInfoId() {
    return displayInfoId;
  }
  public ReservationInfoDto setDisplayInfoId(int displayInfoId) {
    this.displayInfoId = displayInfoId;
    return this;
  }
  public int getUserId() {
    return userId;
  }
  public ReservationInfoDto setUserId(int userId) {
    this.userId = userId;
    return this;
  }
  public Date getReservationDate() {
    return reservationDate;
  }
  public ReservationInfoDto setReservationDate(Date reservationDate) {
    this.reservationDate = reservationDate;
    return this;
  }
  public int getCancelFlag() {
    return cancelFlag;
  }
  public ReservationInfoDto setCancelFlag(int cancelFlag) {
    this.cancelFlag = cancelFlag;
    return this;
  }
  public Date getCreateDate() {
    return createDate;
  }
  public ReservationInfoDto setCreateDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  public Date getModifyDate() {
    return modifyDate;
  }
  public ReservationInfoDto setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
}
