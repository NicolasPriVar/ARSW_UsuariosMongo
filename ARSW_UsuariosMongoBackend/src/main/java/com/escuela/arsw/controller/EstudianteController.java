package com.escuela.arsw.controller;

import com.escuela.arsw.model.Estudiante;
import com.escuela.arsw.repository.EstudianteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
@CrossOrigin(origins = "*")
public class EstudianteController {

    private final EstudianteRepository repo;

    public EstudianteController(EstudianteRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return repo.save(estudiante);
    }

    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return repo.findAll();
    }
}
