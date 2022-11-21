package com.lms.course.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document
public class Section {
    @Id
    private String id;
    private String mediaUrl;
    private List<String> paragraph;
}
