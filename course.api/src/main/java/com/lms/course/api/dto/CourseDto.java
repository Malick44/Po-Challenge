package com.lms.course.api.dto;

import com.lms.course.api.model.Paragraph;
import com.lms.course.api.model.Section;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
    private List<Section> sections =new ArrayList<>();
    private Boolean isNew=true;




}
