package com.lms.users.users_ms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users")
public class AppUser extends Person{

    @ManyToOne()
    @JoinColumn(referencedColumnName = "id")
    private Organization organization;

}
