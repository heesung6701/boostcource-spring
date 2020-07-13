package kr.or.connect.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/auth")
public class AuthController {
  
  @Autowired
  PasswordEncoder passwordEncoder;

  @GetMapping("/loginform")
  public String loginform() {
    return "auth/loginform";
  }

  @PostMapping("/loginerror")
  public String loginerror(@RequestParam("login_error") String loginError) {
    return "auth/loginerror";
  }
}
