package com.javaeplanet.project.controller;


import com.javaeplanet.project.entity.Teacher;
import com.javaeplanet.project.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/teacherDetails")
public class TeacherController {
    @Autowired(required = false)
    private TeacherService service;

    @PostMapping("/saveTeacher")
    public ResponseEntity<String> saveTeacher(@RequestBody Teacher teacher){
        Long tid = service.saveTeacher(teacher);
        return new ResponseEntity<String>("Teacher with '"+tid+"' has been saved", HttpStatus.OK);
    }
    @GetMapping("/teacherList")
    public ResponseEntity<List<Teacher>> getAllTeacherDetails(){
        List<Teacher> list = service.getAllTeacher();
        return new ResponseEntity<List<Teacher>>(list,HttpStatus.OK);
    }
    @GetMapping("/getTeacherById/{tid}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable("id")  Long tid) {
        Teacher std = service.getTeacherById(tid);
        return new ResponseEntity<Teacher>(std, HttpStatus.OK);
    }
    @DeleteMapping("deleteTeacher/{tid}")
    public ResponseEntity<String> deleteTeacher(@PathVariable("tid") Long tid){
        service.deleteTeacher(tid);
        return new ResponseEntity<String>("Teacher with '"+tid+"' has been deleted",HttpStatus.OK);
    }
}
