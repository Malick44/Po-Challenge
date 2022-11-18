package com.lms.course.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lms.course.api.dto.CourseDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ObjectMapper objectMapper =new ObjectMapper();
        CourseDto courseDto = CourseDto.builder()
                .author("Malick")
                .rating("5")
                .title("test")
                .subject("Spring-Mongo")
                .build();
        String jso= objectMapper.writeValueAsString(courseDto);
        System.out.println(jso);
    }
}
