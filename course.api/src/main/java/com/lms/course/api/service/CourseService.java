package com.lms.course.api.service;

import com.lms.course.api.model.Course;
import com.lms.course.api.repository.CourseRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository= courseRepository;
    }

    public List<Course> getAllCourses() {

     return courseRepository.findAll();

    }


    public Course createCourse(Course newCourse) {

        return courseRepository.save(newCourse);
    }

    public Course getCourse(String id){
        Course course = courseRepository.findById(id).get();
        return course;

    }
}
