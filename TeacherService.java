package com.javaeplanet.project.service;

import com.javaeplanet.project.entity.Teacher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface TeacherService {
    public Long saveTeacher(Teacher teacher);
    public List<Teacher> getAllTeacher();
    public Teacher getTeacherById(Long tid);
    public void deleteTeacher(Long tid);

}
