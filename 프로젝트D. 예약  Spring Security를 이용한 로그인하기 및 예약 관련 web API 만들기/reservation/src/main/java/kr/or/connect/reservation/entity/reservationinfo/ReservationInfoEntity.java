package kr.or.connect.reservation.entity.reservationinfo;

import java.util.Date;

public class ReservationInfoEntity {
  private int id;
  private int productId;
  private int displayInfoId;
  private int userId;
  private Date reservationDate;
  private int cancelFlag;
  private Date createDate;
  private Date modifyDate;

  private String productDescription;
  private String productContent;
  private int sumPrice;
  
  public ReservationInfoEntity() {
    this.createDate = new Date();
    this.modifyDate = new Date();
  }
  
  public int getId() {
    return id;
  }
  public ReservationInfoEntity setId(int id) {
    this.id = id;
    return this;
  }
  public int getProductId() {
    return productId;
  }
  public ReservationInfoEntity setProductId(int productId) {
    this.productId = productId;
    return this;
  }
  public int getDisplayInfoId() {
    return displayInfoId;
  }
  public ReservationInfoEntity setDisplayInfoId(int displayInfoId) {
    this.displayInfoId = displayInfoId;
    return this;
  }
  public int getUserId() {
    return userId;
  }
  public ReservationInfoEntity setUserId(int userId) {
    this.userId = userId;
    return this;
  }
  public Date getReservationDate() {
    return reservationDate;
  }
  public ReservationInfoEntity setReservationDate(Date reservationDate) {
    this.reservationDate = reservationDate;
    return this;
  }
  public int getCancelFlag() {
    return cancelFlag;
  }
  public ReservationInfoEntity setCancelFlag(int cancelFlag) {
    this.cancelFlag = cancelFlag;
    return this;
  }
  public Date getCreateDate() {
    return createDate;
  }
  public ReservationInfoEntity setCreateDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  public Date getModifyDate() {
    return modifyDate;
  }
  public ReservationInfoEntity setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  public String getProductDescription() {
    return productDescription;
  }
  public ReservationInfoEntity setProductDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }
  public String getProductContent() {
    return productContent;
  }
  public ReservationInfoEntity setProductContent(String productContent) {
    this.productContent = productContent;
    return this;
  }
  public int getSumPrice() {
    return sumPrice;
  }
  public ReservationInfoEntity setSumPrice(int sumPrice) {
    this.sumPrice = sumPrice;
    return this;
  }
}
