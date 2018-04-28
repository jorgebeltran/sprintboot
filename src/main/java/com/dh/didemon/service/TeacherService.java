package com.dh.didemon.service;

import com.dh.didemon.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

@Service

public class TeacherService {
    private static final List<Teacher> listTeacher= new ArrayList<>();
        public TeacherService(){
            listTeacher.add(new Teacher(1, "rudy"));
            listTeacher.add(new Teacher(2, "carlitos"));
            listTeacher.add(new Teacher(3, "jorge"));
            listTeacher.add(new Teacher(3, "noemi"));
        }
    /*public List<Teacher> getAllTeachers() {
        List<Teacher> listTeachers = new ArrayList<>();
        listTeachers.add(new Teacher(1, "jhonny"));
        listTeachers.add(new Teacher(2, "Gabriel"));
        listTeachers.add(new Teacher(3, "Rudy"));
        return listTeachers;
    }
*/
    //crud
    //list teachers
    public List<Teacher>getAllTeachers(){
        //get all teacher from BD
        return listTeacher;
    }
    //add new teacher
    public void addNewTeacher(Teacher newTeaacher){
        //insert new teacher into DB
        listTeacher.add(newTeaacher);

    }

    //deleted teacher by id
    public void deleteteacher(int id){
        listTeacher.remove(id);
    }
    //get a teacher by id
    public Teacher getTeacher(int id){
        //get  a teacher by id form DB
        return listTeacher.get(id);
    }

}
