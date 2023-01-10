package com.lms.course.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Document
@Component
public class Ratings {

    private int value=5;
    private int rateCount=1;
    private float rateLevel =value/rateCount;

    public int getValue() {
        return value;
    }

    public void setValue(@Min(value = 1)@Max(value = 5)int value) {
        this.value = +value;
        this.rateCount++;
    }

    public int getRateCount() {
        return rateCount;
    }

    public float getRateLevel() {
        return rateLevel;
    }

}
