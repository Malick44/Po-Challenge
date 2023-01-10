package com.lms.controller;

import com.lms.model.Course;
import com.lms.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CourseController {
    @Autowired
    public CourseService courseService;

    @MutationMapping
    public Course addCourse(@Argument Course courseInput){

        return courseService.addCourse(courseInput);
    }
    @QueryMapping
    public List<Course> getAllCourses(){
        return courseService.findAll();
    }
}
