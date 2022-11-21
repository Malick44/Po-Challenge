package com.lms.course.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
    private String title;
    private String author;
    private String subject;
    private String description;
    private String type;
    private String rating;
    private String level;
    private Duration duration;
    private String keywords;
    private String language= "en-US";
    private Integer Year;
    private Integer view;
    private String price;
    private static Long views;
    private String Category;
}
