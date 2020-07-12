package kr.or.connect.reservation.service.security;

public class UserRoleEntity {
  private String userLoginId;
  private String roleName;

  public UserRoleEntity(String userLoginId, String roleName) {
      this.userLoginId = userLoginId;
      this.roleName = roleName;
  }

  public String getUserLoginId() {
      return userLoginId;
  }

  public UserRoleEntity setUserLoginId(String userLoginId) {
      this.userLoginId = userLoginId;
      return this;
  }

  public String getRoleName() {
      return roleName;
  }

  public UserRoleEntity setRoleName(String roleName) {
      this.roleName = roleName;
      return this;
  }
}