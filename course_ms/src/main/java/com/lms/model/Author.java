package com.lms.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Document()
@Component
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    private String id;
    private String firstName, lastName;
    private String fullName= this.firstName+ " "+this.lastName;
    public List<String> coursesList = new ArrayList<>();
}
