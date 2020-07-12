package kr.or.connect.reservation.service.security;

public class UserEntity {
  private String loginUserId;
  private String password;

  public UserEntity(String loginUserId, String password) {
      this.loginUserId = loginUserId;
      this.password = password;
  }

  public String getLoginUserId() {
      return loginUserId;
  }

  public UserEntity setLoginUserId(String loginUserId) {
      this.loginUserId = loginUserId;
      return this;
  }

  public String getPassword() {
      return password;
  }

  public UserEntity setPassword(String password) {
      this.password = password;
      return this;
  }
}