package com.kan.student.dal.studentdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {
    @Autowired
    StudentRepository repo;

    @Test
    void testCreateStudent() {
        Student student = new Student();
        student.setName("Josh");
        student.setCourse("Math");
        student.setFee(30d);
        repo.save(student);
    }

    @Test
    void testFindStundetById() {
        Student student = repo.findById(1l).get();
        System.out.println(student);
    }

    @Test
    void testUpdateStudent() {
        Student student = repo.findById(1l).get();
        student.setFee(40d);
        repo.save(student);
    }

    @Test
    void testDeleteStudent() {
        Student student = repo.findById(1l).get();
        repo.delete(student);
    }

}
