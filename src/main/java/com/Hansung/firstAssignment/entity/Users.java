package com.Hansung.firstAssignment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "USERS")
@Entity
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @NotEmpty(message = "username을 적어주세요")
  @Column(name = "username")
  private String username;

  @Email
  @NotEmpty(message = "email을 적어주세요")
  @Column(name = "email")
  private String email;

  @NotEmpty(message = "password를 적어주세요")
  @Column(name = "password")
  private String password;

  @Builder
  public Users(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

}
