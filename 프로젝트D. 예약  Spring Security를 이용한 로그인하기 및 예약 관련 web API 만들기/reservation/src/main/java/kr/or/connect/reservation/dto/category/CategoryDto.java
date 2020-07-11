package kr.or.connect.reservation.dto.category;

public class CategoryDto {
  private String id;
  private String name;
  private int count;

  public String getId() {
    return id;
  }

  public CategoryDto setId(String id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public CategoryDto setName(String name) {
    this.name = name;
    return this;
  }

  public int getCount() {
    return count;
  }

  public CategoryDto setCount(int count) {
    this.count = count;
    return this;
  }

}
