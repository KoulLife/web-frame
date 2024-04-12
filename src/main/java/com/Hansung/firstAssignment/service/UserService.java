package com.hansung.firstAssignment.service;

import com.hansung.firstAssignment.entity.Users;
import com.hansung.firstAssignment.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void signUp(String username, String email, String password){

    Users user = new Users();
    user.setUsername(username);
    user.setEmail(email);
    user.setPassword(password);

    userRepository.save(user);
  }
}
