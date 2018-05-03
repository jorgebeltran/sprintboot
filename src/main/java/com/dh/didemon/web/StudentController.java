package com.dh.didemon.web;

import com.dh.didemon.domain.Student;
import com.dh.didemon.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class StudentController {
    //inject
    @Autowired
    StudentService studentService;

    //get all student
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();

    }
    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public Student getStundetByid(@PathVariable String id){
        return  studentService.getStudent(id);
    }

    //insert new student
    @RequestMapping(method = RequestMethod.POST)
    public void addNewStudent(@RequestBody Student newStudent) {
        System.out.println("the name of new student is:" + newStudent);
        studentService.addNewStudent(newStudent);
    }

    //deleted student
    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable String id) {
        System.out.println("the of student deleted is: "+ id);
        studentService.deletestudent(id);
    }
    // delete student by Id using Request Body
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteStudentByRequ(@RequestBody  Student student){
        System.out.println("the id of student to delete is "+ student.getCi());
        studentService.deletestudent(student.getId());
    }

}
