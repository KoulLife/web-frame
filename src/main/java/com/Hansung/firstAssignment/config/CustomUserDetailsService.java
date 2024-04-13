package com.Hansung.firstAssignment.config;

import com.Hansung.firstAssignment.entity.Users;
import com.Hansung.firstAssignment.repository.AuthoritiesRepository;
import com.Hansung.firstAssignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private AuthoritiesRepository authoritiesRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Users users = userRepository.findByUsername(username);
    String role = authoritiesRepository.findByUsername(username).getAuthority();

    if (users == null) {
      throw new UsernameNotFoundException("해당 유저가 없습니다");
    } else {
      return new CustomUser(users, role);
    }
  }
}
