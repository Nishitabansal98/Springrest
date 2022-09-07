package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.entities.Course;

public class CourseServiceImpl implements CourseService {

	
		List<Course> list;
		
		public CourseServiceImpl() {
			list=new ArrayList<>();
			list.add(new Course(145, "Java Core Course", "this course"));
			list.add(new Course(105, "Spring Boot Course", "this course"));
		}

		@Override
		public List<Course> getCourses() {
			return list;
	}
	
}
