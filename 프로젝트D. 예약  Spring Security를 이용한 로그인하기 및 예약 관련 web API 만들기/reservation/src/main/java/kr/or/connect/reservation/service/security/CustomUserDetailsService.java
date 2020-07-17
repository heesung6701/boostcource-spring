package kr.or.connect.reservation.service.security;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  UserDbService userDbService;
  
  @Override
  public UserDetails loadUserByUsername(String longinId) throws UsernameNotFoundException {
    UserEntity customUser = userDbService.getUser(longinId);
    if(customUser == null) {
      throw new UsernameNotFoundException("사용자가 입력한 아이디에 해당하는 사용자를 찾을 수 없습니다.");
    }
    List<UserRoleEntity> customRoles = userDbService.getUserRoles(longinId);
    List<GrantedAuthority> authorities = customRoles != null
        ? customRoles
            .stream()
            .map(it -> new SimpleGrantedAuthority(it.getRoleName()))
            .collect(Collectors.toList())
        : new ArrayList<>();
    return new CustomUserDetails()
        .setUsername(customUser.getLoginUserId())
        .setPassword(customUser.getPassword())
        .setAuthorities(authorities)
        .setEnabled(true)
        .setAccountNonExpired(true)
        .setAccountNonLocked(true)
        .setCredentialsNonExpired(true);
  }
}
