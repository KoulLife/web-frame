package com.hansung.firstAssignment.dto;

import com.hansung.firstAssignment.entity.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto {
  @NotEmpty(message = "username을 적어주세요")
  private String username;

  @Email
  @NotEmpty(message = "email을 적어주세요")
  private String email;

  @NotEmpty(message = "password를 적어주세요")
  private String password;
}
