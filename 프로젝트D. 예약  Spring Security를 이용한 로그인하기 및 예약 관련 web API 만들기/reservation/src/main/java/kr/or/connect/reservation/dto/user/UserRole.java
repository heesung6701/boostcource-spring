package kr.or.connect.reservation.dto.user;

public class UserRole {
  private Long id;
  private Long userId;
  private String roleName;

  public UserRole() {}

  public UserRole(Long userId, String roleName) {
    this.userId = userId;
    this.roleName = roleName;
  }

  public Long getId() {
    return id;
  }

  public UserRole setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  public UserRole setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public String getRoleName() {
    return roleName;
  }

  public UserRole setRoleName(String roleName) {
    this.roleName = roleName;
    return this;
  }
}
