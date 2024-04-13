package com.Hansung.firstAssignment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "COURSES")
@Entity
public class Courses {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "수강년도")
  private int year;

  @Column(name = "학기")
  private int semester;

  @Column(name = "교과코드")
  private String courseCode;

  @Column(name = "교과목명")
  private String courseName;

  @Column(name = "교과구분")
  private String courFilter;

  @Column(name = "담당교수")
  private String professor;

  @Column(name = "학점")
  private int gpa;
}
