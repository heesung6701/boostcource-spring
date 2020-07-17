package kr.or.connect.reservation.dto.reservationinfo;

import java.util.List;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoPriceEntity;

public class ReservationInfoAddResult {
  private int id;
  private int productPriceId;
  private int cancelFlag;
  private int displayInfoId;
  private int userId;
  private long reservationDate;
  private long createDate;
  private long modifyDate;
  private List<ReservationInfoPriceEntity> prices;
  
  public int getId() {
    return id;
  }
  public ReservationInfoAddResult setId(int id) {
    this.id = id;
    return this;
  }
  public int getProductPriceId() {
    return productPriceId;
  }
  public ReservationInfoAddResult setProductPriceId(int productId) {
    this.productPriceId = productId;
    return this;
  }
  public int getCancelFlag() {
    return cancelFlag;
  }
  public ReservationInfoAddResult setCancelFlag(int cancelFlag) {
    this.cancelFlag = cancelFlag;
    return this;
  }
  public int getDisplayInfoId() {
    return displayInfoId;
  }
  public ReservationInfoAddResult setDisplayInfoId(int displayInfoId) {
    this.displayInfoId = displayInfoId;
    return this;
  }
  public int getUserId() {
    return userId;
  }
  public ReservationInfoAddResult setUserId(int userId) {
    this.userId = userId;
    return this;
  }
  public long getReservationDate() {
    return reservationDate;
  }
  public ReservationInfoAddResult setReservationDate(long reservationDate) {
    this.reservationDate = reservationDate;
    return this;
  }
  public long getCreateDate() {
    return createDate;
  }
  public ReservationInfoAddResult setCreateDate(long createDate) {
    this.createDate = createDate;
    return this;
  }
  public long getModifyDate() {
    return modifyDate;
  }
  public ReservationInfoAddResult setModifyDate(long modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  public List<ReservationInfoPriceEntity> getPrices() {
    return prices;
  }
  public ReservationInfoAddResult setPrices(List<ReservationInfoPriceEntity> prices) {
    this.prices = prices;
    return this;
  }
}