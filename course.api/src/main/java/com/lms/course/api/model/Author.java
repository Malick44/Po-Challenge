package com.lms.course.api.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.util.List;


@Document
@Component
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {
        @Id
        private Integer id;
        private String firstName, lastName;

        public Author(String firstName){
            this.firstName= firstName;
        }
        public String getAuthorFullName() {
            return firstName + " " + lastName;
        }
        public List<Course> courses;

}
