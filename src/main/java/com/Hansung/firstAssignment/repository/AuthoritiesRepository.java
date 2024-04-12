package com.hansung.firstAssignment.repository;

import com.hansung.firstAssignment.entity.Authorities;
import com.hansung.firstAssignment.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthoritiesRepository extends JpaRepository<Authorities, Long> {

}
