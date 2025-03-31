package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public boolean estaAprobada(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }

    public boolean puedeCursarMateria(Materia materia) {
        return materia.getCorrelativas().stream().allMatch(this::estaAprobada);
    }
}