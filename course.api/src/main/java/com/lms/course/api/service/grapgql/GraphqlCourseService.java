package com.lms.course.api.service.grapgql;

import com.lms.course.api.model.Course;
import com.lms.course.api.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GraphqlCourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public GraphqlCourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
         public List<Course> getAllCourse_(){

        return courseRepository.findAll();

         }

          public Course getCourse(String id){


        return courseRepository.findById(id)
                        .orElseThrow(() ->{
            throw new RuntimeException("No Course found with id: "+id);
        });
          }
}
