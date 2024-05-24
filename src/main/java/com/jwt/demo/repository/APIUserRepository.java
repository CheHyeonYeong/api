package com.jwt.demo.repository;

import com.jwt.demo.domain.APIUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface APIUserRepository extends JpaRepository<APIUser, String> {
}
