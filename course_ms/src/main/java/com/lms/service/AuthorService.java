package com.lms.service;

import com.lms.model.Author;
import com.lms.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public Author addAuthor(Author authorInput) {

        return authorRepository.save(authorInput);
    }


    public void createAuthor(Author author) {
        authorRepository.save(author);
    }

    public List <Author>findAll() {
        return authorRepository.findAll();
    }
}
