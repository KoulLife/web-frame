package com.Hansung.firstAssignment.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

@NoArgsConstructor
@Data
public class CourseDto {
  @NotEmpty(message = "교과코드를 적어주세요")
  private String courseCode;

  @NotEmpty(message = "교과목명을 적어주세요")
  private String courseName;

  @NotEmpty(message = "교과구분을 적어주세요")
  private String courseFilter;

  @NotEmpty(message = "담당교수를 적어주세요")
  private String professor;

  @NotEmpty(message = "학점을 적어주세요")
  private String gpa;
}
