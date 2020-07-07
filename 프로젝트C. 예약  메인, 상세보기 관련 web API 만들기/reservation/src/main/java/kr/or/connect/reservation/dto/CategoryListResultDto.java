package kr.or.connect.reservation.dto;

import java.util.List;

public class CategoryListResultDto {
  private int size;
  private List<CategoryDto> items;

  public int getSize() {
    return size;
  }

  public CategoryListResultDto setSize(int size) {
    this.size = size;
    return this;
  }

  public List<CategoryDto> getItems() {
    return items;
  }

  public CategoryListResultDto setItems(List<CategoryDto> items) {
    this.items = items;
    return this;
  }
}
