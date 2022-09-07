package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses Application";
	}
	
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
		

	}
 
}
