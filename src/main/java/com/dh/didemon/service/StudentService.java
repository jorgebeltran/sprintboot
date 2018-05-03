package com.dh.didemon.service;

import com.dh.didemon.domain.Student;
import com.dh.didemon.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

@Service
public class StudentService {
    private static final List<Student> lisStudent= new ArrayList();
    @Autowired
   private StudentRepository studentRepository;
    /*public StudentService(){
        lisStudent.add(new Student(1, "rudy"));
        lisStudent.add(new Student(2, "carlitos"));
        lisStudent.add(new Student(3, "jorge"));
        lisStudent.add(new Student(3, "noemi"));
    }*/

    public List<Student>getAllStudent(){
        //get all documents from collection student
        return  studentRepository.findAll();
        //get all student from BD
    }
    //add new teacher
    public void addNewStudent(Student newStuudent){
        //insert new student into DB
    studentRepository.save(newStuudent);

    }

    //deleted student by id
    @Deprecated
    public void deletestudent(int id){
        lisStudent.remove(id);
    }

    public void deletestudent(String id){
        studentRepository.deleteById(id);
    }
    //get a student by id
    @Deprecated
    public Student getStudent(int id){
        //get  a student by id form DB
        return lisStudent.get(id);
    }

    public Student getStudent(String id) {
        //get  a student by id form DB
        return  studentRepository.findStudentById(id);
        //return null;
    }
}