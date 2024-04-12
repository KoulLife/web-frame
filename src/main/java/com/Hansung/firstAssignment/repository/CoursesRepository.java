package com.hansung.firstAssignment.repository;

import com.hansung.firstAssignment.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
  List<Courses> findByYearAndSemester(int year, int semester);
}
