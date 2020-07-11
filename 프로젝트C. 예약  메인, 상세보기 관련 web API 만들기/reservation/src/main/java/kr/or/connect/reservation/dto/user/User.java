package kr.or.connect.reservation.dto.user;

import java.util.Date;

public class User {
  private Long id;
  private String name;
  private String password;
  private String email;
  private String phone;
  private Date createDate;
  private Date modifyDate;

  public User() {
    createDate = new Date();
    modifyDate = new Date();
  }

  public User(Long id, String name, String password, String email, String phone) {
    this();
    this.name = name;
    this.password = password;
    this.email = email;
    this.phone = phone;
  }

  public Long getId() {
    return id;
  }

  public User setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public User setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public User setEmail(String email) {
    this.email = email;
    return this;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public User setCreateDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }

  public Date getModifyDate() {
    return modifyDate;
  }

  public User setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

  public String getPhone() {
    return phone;
  }

  public User setPhone(String phone) {
    this.phone = phone;
    return this;
  }
}
