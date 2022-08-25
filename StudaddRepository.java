package com.javaeplanet.project.repos;

import com.javaeplanet.project.entity.Studadd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudaddRepository extends CrudRepository<Studadd, Integer> {
}
