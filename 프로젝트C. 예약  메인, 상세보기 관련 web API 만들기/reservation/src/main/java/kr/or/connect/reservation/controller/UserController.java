package kr.or.connect.reservation.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.or.connect.reservation.dto.user.User;
import kr.or.connect.reservation.service.user.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {
  
  @Autowired
  UserService userService;

  @GetMapping("/joinform")
  public String joinForm(@ModelAttribute User user) {
    return "/user/joinform";
  }
  
  @PostMapping("/join")
  public String join(@Valid User user, BindingResult result) {
    if(result.hasErrors()) {
      return "/user/joinform";
    }
    user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
    userService.addUser(user);
    return "redirect:/";
  }
}
