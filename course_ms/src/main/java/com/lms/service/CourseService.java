package com.lms.service;

import com.lms.model.Course;
import com.lms.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
  @Autowired
  private   CourseRepository courseRepository;
    public Course addCourse(Course courseInput) {

        return courseRepository.save(courseInput);
    }

    public List<Course> findAll() {

      return courseRepository.findAll();
    }
}
