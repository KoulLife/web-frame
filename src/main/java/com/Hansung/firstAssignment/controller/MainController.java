package com.hansung.firstAssignment.controller;

import com.hansung.firstAssignment.dto.CourseDto;
import com.hansung.firstAssignment.dto.UserDto;
import com.hansung.firstAssignment.dto.UserLoginDto;
import com.hansung.firstAssignment.service.CourseService;
import com.hansung.firstAssignment.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;



//@RestController
@Controller
public class MainController {
  private final UserService userService;
  private final CourseService courseService;

  public MainController(UserService userService, CourseService courseService) {
    this.userService = userService;
    this.courseService = courseService;
  }

  @GetMapping("/")
  public String index(){
    return "index";
  }

  @GetMapping("/login")
  public String getLogin(Model model){
    model.addAttribute("userLoginDto", new UserLoginDto());
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(Model model, @Valid UserLoginDto userLoginDto, BindingResult result, HttpSession session){
    if(result.hasErrors()){
      return "login";
    }
    return "redirect:/";
  }

  @GetMapping("/sign-up")
  public String getSignUp(Model model) {
    model.addAttribute("userDto", new UserDto());

    return "signUp";
  }

  @PostMapping("/sign-up")
  public String postSignUp(Model model, @Valid UserDto userDto, BindingResult result){
    if(result.hasErrors()){
      return "signUp";
    }

    String username = userDto.getUsername();
    String email = userDto.getEmail();
    String password = userDto.getPassword();

    userService.signUp(username, email, password);

    return "redirect:/login";
  }

  @GetMapping("/get-gpa")
  public String getGpa(Model model){
    model.addAttribute("courses", courseService.getAllCourses());

    return "getGPA";
  }

  @GetMapping("/gpa-details/{year}/{sem}")
  public String postGpaDetail(Model model, @PathVariable int year, @PathVariable int sem){
    model.addAttribute("courses", courseService.getByYearAndSemester(year,sem));

    return "getDetail";
  }

  @GetMapping("/view-course")
  public String getViewCourse(){

    return "redirect:/gpa-details/2024/2";
  }

  @GetMapping("/enroll-course")
  public String getEnroll(Model model){
    model.addAttribute("courseDto", new CourseDto());

    return "enrollCourse";
  }

  @PostMapping("/enroll-course")
  public String putEnroll(Model model, @Valid CourseDto courseDto, BindingResult result){
    if(result.hasErrors()){
      System.out.println("== Form data does not validated ==");

      List<ObjectError> errors = result.getAllErrors();
      for (ObjectError error : errors){
        System.out.println(error.getDefaultMessage());
      }
      return "enrollCourse";
    }

    int year = 2024;
    int semester = 2;
    String courseCode = courseDto.getCourseCode();
    String courseName = courseDto.getCourseName();
    String courFilter = courseDto.getCourseFilter();
    String professor = courseDto.getProfessor();
    int gpa = Integer.parseInt(courseDto.getGpa());

    System.out.println("GPA RESULT : " + gpa);

    courseService.addCourse(year, semester, courseCode, courseName, courFilter, professor, gpa);

    return "redirect:/";
  }
}
