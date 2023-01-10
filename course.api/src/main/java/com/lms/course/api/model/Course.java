package com.lms.course.api.model;

import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


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
    @Indexed(unique = true)
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
    @DBRef
    @Indexed(unique = true)
    private Category category;
    @DBRef
    private List<Section> sections =new ArrayList<>();
    private Boolean isNew=true;



}
/*
mutation ($course:CourseInput!={
    title:"new Row"
    author: "James"

}) {
    createCourse(course:$course){
        id
        title


}
}


* type Course {
  id: ID
  title: String
  author: Author
  subject: String
  description: String
  type: String
  rating: Rating
  level: String
  duration: Duration
  keywords: [String]
  language: String
  year: Int
  view: Int
  price: String
  views: Long
  category: Category
  sections: [Section]
  isNew: Boolean
}
*
*
* */
