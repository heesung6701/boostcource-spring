package kr.or.connect.reservation.dto;

public class DisplayInfoDto {
  private int id;
  private int categoryId;
  private int displayInfoId;
  private String name;
  private String description;
  private String content;
  private String event;
  private String openingHours;
  private String placeName;
  private String placeLot;
  private String placeStreet;
  private String tel;
  private String homepage;
  private String createDate;
  private String modifyDate;
  private int fileId;
  public int getId() {
    return id;
  }
  public DisplayInfoDto setId(int id) {
    this.id = id;
    return this;
  }
  public int getCategoryId() {
    return categoryId;
  }
  public DisplayInfoDto setCategoryId(int categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  public int getDisplayInfoId() {
    return displayInfoId;
  }
  public DisplayInfoDto setDisplayInfoId(int displayInfoId) {
    this.displayInfoId = displayInfoId;
    return this;
  }
  public String getName() {
    return name;
  }
  public DisplayInfoDto setName(String name) {
    this.name = name;
    return this;
  }
  public String getDescription() {
    return description;
  }
  public DisplayInfoDto setDescription(String description) {
    this.description = description;
    return this;
  }
  public String getContent() {
    return content;
  }
  public DisplayInfoDto setContent(String content) {
    this.content = content;
    return this;
  }
  public String getEvent() {
    return event;
  }
  public DisplayInfoDto setEvent(String event) {
    this.event = event;
    return this;
  }
  public String getOpeningHours() {
    return openingHours;
  }
  public DisplayInfoDto setOpeningHours(String openingHours) {
    this.openingHours = openingHours;
    return this;
  }
  public String getPlaceName() {
    return placeName;
  }
  public DisplayInfoDto setPlaceName(String placeName) {
    this.placeName = placeName;
    return this;
  }
  public String getPlaceLot() {
    return placeLot;
  }
  public DisplayInfoDto setPlaceLot(String placeLot) {
    this.placeLot = placeLot;
    return this;
  }
  public String getPlaceStreet() {
    return placeStreet;
  }
  public DisplayInfoDto setPlaceStreet(String placeStreet) {
    this.placeStreet = placeStreet;
    return this;
  }
  public String getTel() {
    return tel;
  }
  public DisplayInfoDto setTel(String tel) {
    this.tel = tel;
    return this;
  }
  public String getHomepage() {
    return homepage;
  }
  public DisplayInfoDto setHomepage(String homepage) {
    this.homepage = homepage;
    return this;
  }
  public String getCreateDate() {
    return createDate;
  }
  public DisplayInfoDto setCreateDate(String createDate) {
    this.createDate = createDate;
    return this;
  }
  public String getModifyDate() {
    return modifyDate;
  }
  public DisplayInfoDto setModifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  public int getFileId() {
    return fileId;
  }
  public DisplayInfoDto setFileId(int fileId) {
    this.fileId = fileId;
    return this;
  }
}
