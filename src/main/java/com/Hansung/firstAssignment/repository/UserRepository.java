package com.hansung.firstAssignment.repository;

import com.hansung.firstAssignment.entity.Courses;
import com.hansung.firstAssignment.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
  Optional<Users> findByUsername(String username);
}
