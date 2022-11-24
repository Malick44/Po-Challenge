package com.lms.course.api.controller;

import com.lms.course.api.model.Course;
import com.lms.course.api.service.CourseService;
import com.lms.course.api.service.grapgql.GraphqlCourseService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class courseController_ {
    private final GraphqlCourseService graphqlCourseService;
    private final CourseService courseService;
    @Autowired
    public courseController_(GraphqlCourseService graphqlCourseService, CourseService courseService) {
        this.graphqlCourseService = graphqlCourseService;

        this.courseService = courseService;
    }

    @QueryMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }

    @QueryMapping
    public Course Course( @Argument String id) throws Exception {

        return courseService.getCourseById(id);
    }
}
