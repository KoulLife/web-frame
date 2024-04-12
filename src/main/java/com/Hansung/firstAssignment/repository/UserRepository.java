package com.hansung.firstAssignment.repository;

import com.hansung.firstAssignment.entity.Courses;
import com.hansung.firstAssignment.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
  Users findByUsername(String username);
}
