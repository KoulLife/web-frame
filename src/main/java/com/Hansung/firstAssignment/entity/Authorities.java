package com.hansung.firstAssignment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "AUTHORITIES")
@Entity
public class Authorities {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "username")
  private String username;

  @Column(name = "authority")
  private String authority;
}
