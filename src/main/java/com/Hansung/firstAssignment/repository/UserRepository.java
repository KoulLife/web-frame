package com.Hansung.firstAssignment.repository;


import com.Hansung.firstAssignment.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
  Users findByUsername(String username);
}
