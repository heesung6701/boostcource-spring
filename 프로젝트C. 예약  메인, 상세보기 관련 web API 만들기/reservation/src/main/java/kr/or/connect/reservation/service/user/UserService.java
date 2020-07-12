package kr.or.connect.reservation.service.user;

import kr.or.connect.reservation.dto.user.User;
import kr.or.connect.reservation.service.security.UserDbService;

public interface UserService extends UserDbService {
  public long addUser(User user);

  public User getUserByEmail(String loginId);
}
