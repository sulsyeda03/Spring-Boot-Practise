package com.revature.spring.data.jpa.demo.embedded.repository;

import com.revature.spring.data.jpa.demo.embedded.entity.Course;
import com.revature.spring.data.jpa.demo.embedded.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void SaveCourseMaterial(){
        Course course = Course.builder()
                .title("Java")
                .credit(1000)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("http://localhost:8080")
                .course(course)
                .build();
        repository.save(courseMaterial);
    }

    @Test
    public void displayAllCourse(){
        List<CourseMaterial> courseMaterialList = repository.findAll();
        System.out.println(courseMaterialList);
    }

}