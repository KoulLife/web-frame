package com.hansung.firstAssignment.service;

import com.hansung.firstAssignment.dto.UserLoginDto;
import com.hansung.firstAssignment.entity.Authorities;
import com.hansung.firstAssignment.entity.Users;
import com.hansung.firstAssignment.repository.AuthoritiesRepository;
import com.hansung.firstAssignment.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

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
    user.setPassword(password);

    userRepository.save(user);
  }


}
