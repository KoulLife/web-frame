package com.hansung.firstAssignment.dto;

import com.hansung.firstAssignment.entity.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserLoginDto {
  @NotEmpty(message = "username을 적어주세요")
  private String username;

  @NotEmpty(message = "password를 적어주세요")
  private String password;

}
