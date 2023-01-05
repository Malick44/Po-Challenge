package com.lms.course.api.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Document(collection = "paragraph")
@Component
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Paragraph {
    @Id
    private String id;
    private String sectionId;
    private String title;
    private String paragraph;
}
