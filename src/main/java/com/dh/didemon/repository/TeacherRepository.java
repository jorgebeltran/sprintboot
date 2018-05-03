package com.dh.didemon.repository;

import com.dh.didemon.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TeacherRepository extends MongoRepository<Teacher,String> {
    Teacher findTeacherById(String id);
}
