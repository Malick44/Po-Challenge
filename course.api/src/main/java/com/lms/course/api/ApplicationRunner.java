package com.lms.course.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lms.course.api.dto.CourseDto;
import com.lms.course.api.model.Course;
import com.lms.course.api.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public void run(String... args) throws Exception {
        ObjectMapper objectMapper =new ObjectMapper();
        CourseDto courseDto = CourseDto.builder()
                .author("Malick")
                .rating("5")
                .title("test")
                .subject("Spring-Mongo")
                .isNew(true)
                .build();

        String jso= objectMapper.writeValueAsString(courseDto);
//        Course ncourse= new Course();
//        ncourse.setTitle(courseDto.getTitle());
//        courseRepository.save(ncourse);
        System.out.println(jso);
    }
}
