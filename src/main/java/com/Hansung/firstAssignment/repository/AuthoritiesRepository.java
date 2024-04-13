package com.Hansung.firstAssignment.repository;

import com.Hansung.firstAssignment.entity.Authorities;
import jakarta.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities, Long> {
  Authorities findByUsername(String username);
//  Authorities getAuthoritiesByUsername(String username);

}
