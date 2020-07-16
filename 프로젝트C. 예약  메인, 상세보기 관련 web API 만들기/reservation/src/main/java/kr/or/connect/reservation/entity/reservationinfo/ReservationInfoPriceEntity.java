package kr.or.connect.reservation.entity.reservationinfo;

public class ReservationInfoPriceEntity {
  private int id;
  private int reservationInfoId;
  private int productPriceId;
  private int count;
  
  public int getId() {
    return id;
  }
  public ReservationInfoPriceEntity setId(int id) {
    this.id = id;
    return this;
  }
  public int getReservationInfoId() {
    return reservationInfoId;
  }
  public ReservationInfoPriceEntity setReservationInfoId(int reservationInfoId) {
    this.reservationInfoId = reservationInfoId;
    return this;
  }
  public int getProductPriceId() {
    return productPriceId;
  }
  public ReservationInfoPriceEntity setProductPriceId(int productPriceId) {
    this.productPriceId = productPriceId;
    return this;
  }
  public int getCount() {
    return count;
  }
  public ReservationInfoPriceEntity setCount(int count) {
    this.count = count;
    return this;
  }
}
