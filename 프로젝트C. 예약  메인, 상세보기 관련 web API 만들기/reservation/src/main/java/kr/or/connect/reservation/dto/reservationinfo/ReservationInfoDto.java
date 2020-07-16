package kr.or.connect.reservation.dto.reservationinfo;

import java.util.List;

public class ReservationInfoDto {
  private int productId;
  private int displayInfoId;
  private int userId;
  private String reservationYearMonthDay;
  private List<ReservationInfoPriceDto> prices;
  
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
  public List<ReservationInfoPriceDto> getPrices() {
    return prices;
  }
  public ReservationInfoDto setPrices(List<ReservationInfoPriceDto> prices) {
    this.prices = prices;
    return this;
  }
  public String getReservationYearMonthDay() {
    return reservationYearMonthDay;
  }
  public ReservationInfoDto setReservationYearMonthDay(String reservationYearMonthDay) {
    this.reservationYearMonthDay = reservationYearMonthDay;
    return this;
  }
}