package com.lms.course.api.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class RatingConverter implements AttributeConverter<Rating,String> {
    @Override
    public String convertToDatabaseColumn(Rating rating) {
        if(rating==null)
        return null;
        return rating.getStar();
    }

    @Override
    public Rating convertToEntityAttribute(String star) {
        if (star==null)
        return null;
        return Stream.of(Rating.values())
                .filter(s ->s.getStar().equals(star))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }
}
