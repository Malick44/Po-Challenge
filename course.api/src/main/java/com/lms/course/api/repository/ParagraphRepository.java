package com.lms.course.api.repository;

import com.lms.course.api.model.Paragraph;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParagraphRepository extends MongoRepository <Paragraph,String> {
}
