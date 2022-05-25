package com.fullstackdevelopment.userregistration.repositories;

import com.fullstackdevelopment.userregistration.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
