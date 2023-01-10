package com.lms.users.users_ms.dto;

import jakarta.validation.constraints.Digits;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.lms.users.users_ms.model.Organization} entity
 */
@Data
public class OrganizationDto implements Serializable {
    private final String Id;
    @Digits(fraction = 0, integer = 10)
    private final String phoneNumber;
}