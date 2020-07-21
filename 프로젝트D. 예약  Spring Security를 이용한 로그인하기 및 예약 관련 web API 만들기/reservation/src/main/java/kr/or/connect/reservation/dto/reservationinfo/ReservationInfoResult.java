package kr.or.connect.reservation.dto.reservationinfo;

import java.util.List;

public class ReservationInfoResult {

  private int size;
  private List<ReservationInfoDto> items;
  
  public int getSize() {
    return size;
  }
  public ReservationInfoResult setSize(int size) {
    this.size = size;
    return this;
  }
  public List<ReservationInfoDto> getItems() {
    return items;
  }
  public ReservationInfoResult setItems(List<ReservationInfoDto> items) {
    this.items = items;
    return this;
  } 
}
