package com.lms.course.api.service;

import com.lms.course.api.model.Author;
import com.lms.course.api.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public Author addAuthor(Author authorInput) {

        return authorRepository.save(authorInput);
    }

    public void createAuthor(Author author) {
        authorRepository.save(author);
    }
}
