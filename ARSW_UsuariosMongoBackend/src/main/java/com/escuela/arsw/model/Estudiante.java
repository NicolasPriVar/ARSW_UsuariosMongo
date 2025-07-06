package com.escuela.arsw.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document(collection = "estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    @Id
    private String id;
    private String nombre;
    private String correo;
    private String fechaNacimiento;
    private String programa;
}