package com.millerproject.coursespring.repositories;

import com.millerproject.coursespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
