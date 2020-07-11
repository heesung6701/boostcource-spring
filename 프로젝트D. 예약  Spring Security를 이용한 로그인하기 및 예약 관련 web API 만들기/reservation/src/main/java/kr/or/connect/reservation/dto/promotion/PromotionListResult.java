package kr.or.connect.reservation.dto.promotion;

import java.util.List;

public class PromotionListResult {
  private int size;
  private List<PromotionDto> items;

  public int getSize() {
    return size;
  }

  public PromotionListResult setSize(int size) {
    this.size = size;
    return this;
  }

  public List<PromotionDto> getItems() {
    return items;
  }

  public PromotionListResult setItems(List<PromotionDto> items) {
    this.items = items;
    return this;
  }
}
