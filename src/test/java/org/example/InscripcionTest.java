package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class InscripcionTest {
        @Test
        @DisplayName("Verificar que la inscripcion fue aprobada")
        public void fueAprobada() {

            Materia am1 = new Materia("AM1", new ArrayList<>());                                   //instancio las materias
            Materia f1 = new Materia("F1", new ArrayList<>());
            Materia am2 = new Materia("AM2", Arrays.asList(am1));
            Materia f2 = new Materia("F2", Arrays.asList(am1, f1));
            Alumno facu = new Alumno("Facundo", "Carusi", Arrays.asList(am1, f1));       //instancio al alumno(a mi)
            Inscripcion inscripcion = new Inscripcion(facu, Arrays.asList(am2, f2));                    //instancio mi inscripcion


            //verifico que la inscripcion fue aprobada
            assertTrue(inscripcion.fueAprobada());
            assertTrue(inscripcion.fueAprobada1());
            assertTrue(inscripcion.fueAprobada2());
            //los 3 para ver si funcionan los 3 methods
        }
}