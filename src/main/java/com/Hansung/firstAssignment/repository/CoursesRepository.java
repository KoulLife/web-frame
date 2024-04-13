package com.Hansung.firstAssignment.repository;

import com.Hansung.firstAssignment.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
  List<Courses> findByYearAndSemester(int year, int semester);
}
