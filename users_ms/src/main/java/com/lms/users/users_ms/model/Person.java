package com.lms.users.users_ms.model;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;

@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name = "first_name")
    @NotEmpty
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    private String fullName= "{firstName} {lastName}";

}
