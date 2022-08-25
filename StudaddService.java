package com.javaeplanet.project.service;

import com.javaeplanet.project.entity.Studadd;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface StudaddService {
    public Integer saveStudadd(Studadd studadd);
    public List<Studadd> getAllStudadd();
    public Studadd getStudaddById(Integer id);

    void deleteStudadd(Integer id);
}
