package com.example.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
