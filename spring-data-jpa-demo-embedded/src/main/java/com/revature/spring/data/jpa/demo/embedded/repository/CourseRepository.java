package com.revature.spring.data.jpa.demo.embedded.repository;

import com.revature.spring.data.jpa.demo.embedded.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}