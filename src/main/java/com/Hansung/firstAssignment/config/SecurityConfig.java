package com.hansung.firstAssignment.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
//  private final UserDetailsService userDetailsService;
//
//  public SecurityConfig(UserDetailsService userDetailsService) {
//    this.userDetailsService = userDetailsService;
//  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http
            .csrf(csrf -> {
              csrf.disable();
            })
            .cors(cors -> cors.disable())
            .authorizeHttpRequests(auth -> {
              auth.requestMatchers("/").permitAll();
              auth.requestMatchers("/login").permitAll();
              auth.requestMatchers("/sign-up").permitAll();
              auth.requestMatchers("/h2-console/**").permitAll();
              auth.requestMatchers("/WEB-INF/jsp/**").permitAll();
              auth.anyRequest().authenticated();
            })
            .formLogin(form -> form
                    .loginPage("/login")
                    .defaultSuccessUrl("/", true)
                    .permitAll()
            )
            .build();
  }
}
