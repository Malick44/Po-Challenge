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

    public List<Course> getAllCourse() {

     return courseRepository.findAll();

    }


    public Course createCourse(Course newCourse) {

        return courseRepository.save(newCourse);
    }

    public Course getCourseById(String id) throws Exception {
        Course course = courseRepository.findById(id).orElseThrow(() ->{
            return new Exception("No course with id : "+id);
        });
        return course;

    }
}
