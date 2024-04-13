package com.Hansung.firstAssignment.config;

import com.Hansung.firstAssignment.entity.Authorities;
import com.Hansung.firstAssignment.entity.Users;
import com.Hansung.firstAssignment.repository.AuthoritiesRepository;
import com.Hansung.firstAssignment.service.AuthoritiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class CustomUser implements UserDetails {

  private Users users;
  String role;

  private AuthoritiesRepository authoritiesRepository;


  public CustomUser(Users users, String role){
    super();
    this.users = users;
    this.role = role;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);

    return Arrays.asList(authority);
  }

  @Override
  public String getPassword() {
    return users.getPassword();
  }

  @Override
  public String getUsername() {
    return users.getUsername();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
