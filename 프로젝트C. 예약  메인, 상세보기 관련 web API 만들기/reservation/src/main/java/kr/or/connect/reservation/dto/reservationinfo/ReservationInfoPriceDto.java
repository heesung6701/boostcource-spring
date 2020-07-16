package kr.or.connect.reservation.dto.reservationinfo;

public class ReservationInfoPriceDto {
  private int count;
  private int productPriceId;
  public int getCount() {
    return count;
  }
  public ReservationInfoPriceDto setCount(int count) {
    this.count = count;
    return this;
  }
  public int getProductPriceId() {
    return productPriceId;
  }
  public ReservationInfoPriceDto setProductPriceId(int productPriceId) {
    this.productPriceId = productPriceId;
    return this;
  }
}
