package com.hansung.firstAssignment.repository;

import com.hansung.firstAssignment.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
}
