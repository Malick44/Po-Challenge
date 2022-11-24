package com.lms.course.api.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


public enum Rating {
        FIVE_STARS("⭐️⭐️⭐️⭐️⭐️️️️"),
        FOUR_STARS("⭐️⭐️⭐️⭐️"),
        THREE_STARS("⭐️⭐️⭐️"),
        TWO_STARS("⭐️⭐️"),
        ONE_STAR("⭐️");
    private String star;
    Rating(String star) {
        this.star=star;
    }
    @JsonValue
    public String getStar() {
        return star;
    }
}
