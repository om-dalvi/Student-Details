package com.javaeplanet.project.controller;

import com.javaeplanet.project.entity.Studadd;
import com.javaeplanet.project.service.StudaddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/studaddDetails")
public class StudaddController {
    @Autowired(required = false)
    private StudaddService service;

    @PostMapping("/saveStudadd")
    public ResponseEntity<String> saveStudadd(@RequestBody Studadd studadd) {
        Integer id = service.saveStudadd(studadd);
        return new ResponseEntity<String>("Student and address with '" + id + "' has been saved", HttpStatus.OK);
    }

    @GetMapping("/studaddList")
    public ResponseEntity<List<Studadd>> getAllStudaddDetails() {
        List<Studadd> list = service.getAllStudadd();
        return new ResponseEntity<List<Studadd>>(list, HttpStatus.OK);
    }

    @GetMapping("/getStudaddById/{id}")
    public ResponseEntity<Studadd> getStudaddById(@PathVariable("id") Integer id) {
        Studadd stad = service.getStudaddById(id);
        return new ResponseEntity<Studadd>(stad, HttpStatus.OK);
    }

    @DeleteMapping("deleteStudadd/{id}")
    public ResponseEntity<String> deleteStudadd(@PathVariable("id") Integer id) {
        service.deleteStudadd(id);
        return new ResponseEntity<String>("Student and address with '" + id + "' has been deleted", HttpStatus.OK);
    }
}