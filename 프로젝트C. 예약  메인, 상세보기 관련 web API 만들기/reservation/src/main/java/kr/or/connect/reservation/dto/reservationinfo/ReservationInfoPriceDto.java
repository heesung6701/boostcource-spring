package kr.or.connect.reservation.dto.reservationinfo;

public class ReservationInfoPriceDto {
  private int id;
  private int reservationInfoId;
  private int product_price_id;
  private int count;
  
  public int getId() {
    return id;
  }
  public ReservationInfoPriceDto setId(int id) {
    this.id = id;
    return this;
  }
  public int getReservationInfoId() {
    return reservationInfoId;
  }
  public ReservationInfoPriceDto setReservationInfoId(int reservationInfoId) {
    this.reservationInfoId = reservationInfoId;
    return this;
  }
  public int getProduct_price_id() {
    return product_price_id;
  }
  public ReservationInfoPriceDto setProduct_price_id(int product_price_id) {
    this.product_price_id = product_price_id;
    return this;
  }
  public int getCount() {
    return count;
  }
  public ReservationInfoPriceDto setCount(int count) {
    this.count = count;
    return this;
  }
}
