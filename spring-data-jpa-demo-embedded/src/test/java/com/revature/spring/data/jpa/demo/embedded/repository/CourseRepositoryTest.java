package com.revature.spring.data.jpa.demo.embedded.repository;

import com.revature.spring.data.jpa.demo.embedded.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository repository;

    @Test
    public void displayAllCourse(){
        List<Course> courses = repository.findAll();
        System.out.println(courses);

    }


}