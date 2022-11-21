package com.lms.course.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

    @Document
    public record Author(Integer id, String firstName, String lastName) {
        public String getAuthorFullName() {
            return firstName + " " + lastName;
        }


}
