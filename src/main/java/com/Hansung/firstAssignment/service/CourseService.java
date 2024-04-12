package com.hansung.firstAssignment.service;

import com.hansung.firstAssignment.entity.Courses;
import com.hansung.firstAssignment.repository.CoursesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
  private final CoursesRepository coursesRepository;

  public CourseService(CoursesRepository coursesRepository) {
    this.coursesRepository = coursesRepository;
  }

  public List<Courses> getAllCourses(){
    return coursesRepository.findAll();
  }
}
