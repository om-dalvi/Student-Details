package com.javaeplanet.project.service;

import com.javaeplanet.project.entity.Studadd;
import com.javaeplanet.project.repos.StudaddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudaddServiceImpl implements StudaddService {
    @Autowired
    private StudaddRepository repository;

    @Override
    public Integer saveStudadd(Studadd studadd) {
        return repository.save(studadd).getId();
    }

    @Override
    public List<Studadd> getAllStudadd() {
        return null;
    }

    @Override
    public Studadd getStudaddById(Integer id) {
        return null;
    }
    @Override
    public void deleteStudadd(Integer id) {
        repository.deleteById(id);
    }
}
