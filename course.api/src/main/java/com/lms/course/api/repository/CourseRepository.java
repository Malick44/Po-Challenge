package com.lms.course.api.repository;

import com.lms.course.api.model.Course;
import com.lms.course.api.model.Rating;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

    //Query byAuthor = Query().
   List<Course> findByTitleLike(String title);


}
