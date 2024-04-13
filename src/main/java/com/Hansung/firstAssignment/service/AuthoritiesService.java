package com.Hansung.firstAssignment.service;


import com.Hansung.firstAssignment.entity.Users;
import com.Hansung.firstAssignment.repository.AuthoritiesRepository;
import com.Hansung.firstAssignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthoritiesService {
  private final AuthoritiesRepository authoritiesRepository;

  public AuthoritiesService(AuthoritiesRepository authoritiesRepository) {
    this.authoritiesRepository = authoritiesRepository;
  }

  public String getAuth(String username){
    return authoritiesRepository.findByUsername(username).getAuthority();
  }

}
