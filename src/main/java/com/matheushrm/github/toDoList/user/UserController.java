package com.matheushrm.github.toDoList.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
  
  @PostMapping("/")
  public void createUser(@RequestBody UserModel UserModel) {
    System.out.println("User created!");
  }
}
