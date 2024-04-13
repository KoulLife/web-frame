package com.Hansung.firstAssignment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


@Configuration
public class SecurityConfig {

  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public UserDetailsService getDetailsService() {
    return new CustomUserDetailsService();
  }

  @Bean
  public DaoAuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
    daoAuthenticationProvider.setUserDetailsService(getDetailsService());
    daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
    return daoAuthenticationProvider;
  }


  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http
            .csrf(csrf -> {
              csrf.disable();
            })
            .cors(cors -> cors.disable())
            .authorizeHttpRequests(auth -> {
              auth.requestMatchers("/").permitAll();
              auth.requestMatchers("/user-logout").permitAll();
              auth.requestMatchers("/sign-in").permitAll();
              auth.requestMatchers("/sign-up").permitAll();
              auth.requestMatchers("/h2-console/**").permitAll();
              auth.requestMatchers("/WEB-INF/jsp/**").permitAll();
              auth.anyRequest().authenticated();
            })
            .formLogin(form -> form
                    .loginPage("/sign-in")
                    .loginProcessingUrl("/login")
                    .defaultSuccessUrl("/", true)
                    .permitAll()
            )
            .logout(
                    logout -> logout
                            .logoutSuccessUrl("/user-logout")
                            .permitAll()
            )
            .build();
  }

}
