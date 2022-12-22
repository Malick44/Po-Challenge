package com.lms.users.users_ms.repository;

import com.lms.users.users_ms.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationRepository extends JpaRepository<Organization,String> {      }
