package com.lms.course.api.model;

import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "section")
@Component
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Section {
    @Id
    private String id;
    @DBRef
    private List<Media> mediaList;
    @DBRef
    @Indexed(unique = true)
    private List<Lecture> readingText;
}
