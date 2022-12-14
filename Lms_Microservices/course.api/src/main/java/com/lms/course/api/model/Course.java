package com.lms.course.api.model;

import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.time.Duration;


@NoArgsConstructor
@Document(collection = "course")
@Component
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Course {

   @Id
    private String id;

   @TextIndexed
   private String title;
    @Indexed
    @DBRef
    private Author author;
    @TextIndexed
    private String subject;
    @TextIndexed
    private String description;
    private String type;
    private Rating rating;
    private String level;
    private Duration duration;
    private String[] keywords;
    private String language= "en-US";
    private Integer Year;
    private Integer view;
    private String price;
    private static Long views;
    private Category Category;
    @DBRef private Section section;



}