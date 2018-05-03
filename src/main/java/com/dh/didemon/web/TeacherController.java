package com.dh.didemon.web;

import com.dh.didemon.domain.Teacher;
import com.dh.didemon.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")


public class TeacherController {
    /*//dependency teachercontroller
        @Autowired
        TeacherService teacherService;
        @RequestMapping(method = RequestMethod.GET)
        public List<Teacher> getTeacher(){
            return teacherService.getAllTeachers();
        }
        @RequestMapping(path = "hello",method = RequestMethod.GET)
        public String hello() {
            return "hello word"+calcul();
        }
        private String calcul(){
            return  "nada";
        }*/
//dependecy inject
    @Autowired
    private TeacherService teacherService;

    //get all teahers
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();

    }
    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public Teacher getTeacherByid(@PathVariable String id) {
        return  teacherService.getTeacher(id);
        //return teacherService.getTeacher(id);

    }

    //insert new Teacher
    @RequestMapping(method = RequestMethod.POST)
    public void addNewTeacher(@RequestBody Teacher newTeacher) {
        System.out.println("the name of new teacher is:" + newTeacher);
        teacherService.addNewTeacher(newTeacher);
    }

    //deleted Teacher
    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public void deleteteacher(@PathVariable String id) {
        System.out.println("the of teacher deleted is: "+ id);
        teacherService.deleteteacher(id);
        //teacherService.deleteteacher(id);
    }
    // delete Teacher by Id using Request Body
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteTeacherByRequ(@RequestBody Teacher teacher){
        System.out.println("the id of teacher to delete is "+ teacher.getCi());
        teacherService.deleteteacher(teacher.getId());
        //teacherService.deleteteacher((int)teacher.getCi());
    }

}
