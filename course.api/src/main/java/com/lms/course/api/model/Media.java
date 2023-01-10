package com.lms.course.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Document
@Component
class Media {
    @Id
    private String id;
    private String title;
    private String sectionId;
    private String url;
    private String type; // "image", "video", etc.
    }
