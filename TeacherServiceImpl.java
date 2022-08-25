package com.javaeplanet.project.service;

import com.javaeplanet.project.entity.Teacher;
import com.javaeplanet.project.repos.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public abstract class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository repository;

    @Override
    public Long saveTeacher(Teacher teacher) { return repository.save(teacher).getTid();}

    @Override
    public List<Teacher> getAllTeacher() { return (List<Teacher>) repository.findAll();}

    @Override
    public Teacher getTeacherById(Long tid) { return repository.findById(tid).get();}

    @Override
    public void deleteTeacher(Long tid) { repository.deleteById(tid);}
}
