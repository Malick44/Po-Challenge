package com.lms.course.api.repository;
import com.lms.course.api.model.Lecture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends MongoRepository <Lecture,String> {
}
