package com.lms.course.api.controller;


import com.lms.course.api.dto.CourseDto;
import com.lms.course.api.model.Course;
import com.lms.course.api.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
   private final CourseService courseService;

   private final ModelMapper mapper;

//
    @Autowired
    private CourseController(CourseService courseService, ModelMapper mapper){
        this.courseService=courseService;
        this.mapper=mapper;
    }
    @GetMapping
    public List<Course> getAllCourses(){
       return courseService.getAllCourses();
    }
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable String id){

        return courseService.getCourse(id);
    }
    @PostMapping("/createCourse")
    @Transient
    public void addCourse(@RequestBody CourseDto courseDto){
        Course newCourse = dtoToCourse(courseDto);
        newCourse.setAuthor("Malick");
        newCourse.setTitle("try");
        courseService.createCourse(newCourse);
    }



    protected Course dtoToCourse(CourseDto courseDto) {

        return mapper.map(courseDto,Course.class);
    }

}
