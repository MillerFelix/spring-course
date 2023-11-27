package com.millerproject.coursespring.repositories;

import com.millerproject.coursespring.entities.Category;
import com.millerproject.coursespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
