package com.lms.users.users_ms.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.lms.users.users_ms.model.AppUser} entity
 */
@Data
public class AppUserDto implements Serializable {
    private final String Id;
    @NotEmpty
    private final String firstName;
    private final String lastName;
    private final String fullName;
    private final String organizationId;
}