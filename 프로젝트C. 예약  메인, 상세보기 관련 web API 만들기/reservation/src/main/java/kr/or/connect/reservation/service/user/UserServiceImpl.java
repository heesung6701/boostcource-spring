package kr.or.connect.reservation.service.user;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import kr.or.connect.reservation.dao.user.UserDao;
import kr.or.connect.reservation.dao.user.UserRoleDao;
import kr.or.connect.reservation.dto.user.User;
import kr.or.connect.reservation.dto.user.UserRole;
import kr.or.connect.reservation.service.security.UserEntity;
import kr.or.connect.reservation.service.security.UserRoleEntity;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserDao userDao;
  @Autowired
  UserRoleDao userRoleDao;

  @Override
  @Transactional
  public long addUser(User user) {
    return userDao.addUser(user);
  }

  @Override
  @Transactional
  public UserEntity getUser(String loginUserId) {
    User user = userDao.getUserByEmail(loginUserId);
    return new UserEntity(user.getEmail(), user.getPassword());
  }

  @Override
  @Transactional
  public List<UserRoleEntity> getUserRoles(String loginUserId) {
    List<UserRole> memberRoles = userRoleDao.getRolesByEmail(loginUserId);
    return memberRoles.stream().map(it -> new UserRoleEntity(loginUserId, it.getRoleName()))
        .collect(Collectors.toList());
  }

  @Override
  public User getUserByEmail(String loginId) {
    return userDao.getUserByEmail(loginId);
  }
}
