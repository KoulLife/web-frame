package com.Hansung.firstAssignment.service;


import com.Hansung.firstAssignment.entity.Users;
import com.Hansung.firstAssignment.repository.AuthoritiesRepository;
import com.Hansung.firstAssignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  @Autowired
  private BCryptPasswordEncoder passwordEncoder;
  private final UserRepository userRepository;
  private final AuthoritiesRepository authoritiesRepository;

  public UserService(UserRepository userRepository, AuthoritiesRepository authoritiesRepository) {
    this.userRepository = userRepository;
    this.authoritiesRepository = authoritiesRepository;
  }

  public void signUp(String username, String email, String password){

    Users user = new Users();
    user.setUsername(username);
    user.setEmail(email);
    user.setPassword(passwordEncoder.encode(password));

    userRepository.save(user);
  }

}
