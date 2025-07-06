package com.escuela.arsw.repository;

import com.escuela.arsw.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
}