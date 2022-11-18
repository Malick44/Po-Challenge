package com.lms.course.api.repository;

import com.lms.course.api.model.Course;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
    Course findByAuthor(String author);


    List<Course> findByKeywordsOrderByRatingDesc(String keyword, Sort sort);

    //Query byAuthor = Query().
   List<Course> findByTitleLike(String title);


}
