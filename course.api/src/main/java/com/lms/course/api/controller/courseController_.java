package com.lms.course.api.controller;

import com.lms.course.api.model.Author;
import com.lms.course.api.model.Course;
import com.lms.course.api.repository.AuthorRepository;
import com.lms.course.api.service.AuthorService;
import com.lms.course.api.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RequiredArgsConstructor
@RestController
public class courseController_ {
    @Autowired
    private final CourseService courseService;
    @Autowired
    private final AuthorService authorService;


    @QueryMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }

    @QueryMapping
    public Course Course( @Argument String id) throws Exception {

        return courseService.getCourseById(id);
    }

    @MutationMapping
    public Course  createCourse(@Argument Course courseInput){
        courseService.createCourse(courseInput);
        return courseInput;
    }
    @MutationMapping
    public void addAuthor(@Argument Author authorInput){
        authorService.addAuthor(authorInput);

    }
@PostMapping("/author")
    public void createAuthor(@RequestBody Author author){
        authorService.createAuthor(author);

    }
}
