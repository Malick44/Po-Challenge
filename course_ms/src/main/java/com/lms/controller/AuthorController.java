package com.lms.controller;

import com.lms.model.Author;
import com.lms.service.AuthorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Validated
public class AuthorController {
    @Autowired
    private AuthorService authorService;


    @MutationMapping
    public Author addAuthor(@Argument @Valid Author authorInput){
       return authorService.addAuthor(authorInput);

    }
    @QueryMapping
    public List<Author> getAllAuthors(){

       return authorService.findAll();
    }


}
