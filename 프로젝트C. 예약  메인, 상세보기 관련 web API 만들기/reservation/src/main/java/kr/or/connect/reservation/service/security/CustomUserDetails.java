package kr.or.connect.reservation.service.security;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {

  private static final long serialVersionUID = -944800212145147425L;
  
  private String username;
  private String password;
  private boolean isEnabled;
  private boolean isAccountNonExpired;
  private boolean isAccountNonLocked;
  private boolean isCredentialsNonExpired;
  private Collection<? extends GrantedAuthority> authorities;

  public String getUsername() {
    return username;
  }
  public CustomUserDetails setUsername(String username) {
    this.username = username;
    return this;
  }
  public String getPassword() {
    return password;
  }
  public CustomUserDetails setPassword(String password) {
    this.password = password;
    return this;
  }
  public boolean isEnabled() {
    return isEnabled;
  }
  public CustomUserDetails setEnabled(boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }
  public boolean isAccountNonExpired() {
    return isAccountNonExpired;
  }
  public CustomUserDetails setAccountNonExpired(boolean isAccountNonExpired) {
    this.isAccountNonExpired = isAccountNonExpired;
    return this;
  }
  public boolean isAccountNonLocked() {
    return isAccountNonLocked;
  }
  public CustomUserDetails setAccountNonLocked(boolean isAccountNonLocked) {
    this.isAccountNonLocked = isAccountNonLocked;
    return this;
  }
  public boolean isCredentialsNonExpired() {
    return isCredentialsNonExpired;
  }
  public CustomUserDetails setCredentialsNonExpired(boolean isCredentialsNonExpired) {
    this.isCredentialsNonExpired = isCredentialsNonExpired;
    return this;
  }
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }
  public CustomUserDetails setAuthorities(Collection<? extends GrantedAuthority> authorities) {
    this.authorities = authorities;
    return this;
  }
}
