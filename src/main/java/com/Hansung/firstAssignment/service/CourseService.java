package com.Hansung.firstAssignment.service;

import com.Hansung.firstAssignment.entity.Courses;
import com.Hansung.firstAssignment.repository.CoursesRepository;
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

  public List<Courses> getByYearAndSemester(int year, int semester){
    return coursesRepository.findByYearAndSemester(year, semester);
  }

  public void addCourse(int y, int s, String cc, String cn, String cf, String p, int gpa){
    Courses course = new Courses();
    course.setYear(y);
    course.setSemester(s);
    course.setCourseCode(cc);
    course.setCourseName(cn);
    course.setCourFilter(cf);
    course.setProfessor(p);
    course.setGpa(gpa);

    coursesRepository.save(course);
  }
}
