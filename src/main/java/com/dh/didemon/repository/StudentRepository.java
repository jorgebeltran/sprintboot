package com.dh.didemon.repository;

import com.dh.didemon.domain.Student;
import com.dh.didemon.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student, String> {
    Student findStudentById(String id);
}
