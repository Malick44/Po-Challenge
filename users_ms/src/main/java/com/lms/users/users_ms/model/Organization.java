package com.lms.users.users_ms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Digits;

@Entity
public class Organization extends BaseEntity {

    @Column(name = "telephone")
    @Digits(fraction= 0, integer=10)
    private String phoneNumber;
}
