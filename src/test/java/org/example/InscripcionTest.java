package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class InscripcionAprobadaTest {
        private Materia aga;
        private Materia am1;
        private Materia f1;
        private Materia am2;
        private Materia f2;
        private Alumno facu;

        @BeforeEach
        public void setUp() {
            aga = new Materia("AGA", new ArrayList<>());
            am1 = new Materia("AM1", new ArrayList<>());
            f1 = new Materia("F1", new ArrayList<>());
            am2 = new Materia("AM2", Arrays.asList(am1, aga));
            f2 = new Materia("F2", Arrays.asList(am1, f1));
            facu = new Alumno("Facundo", "Carusi", new ArrayList<>());
        }
        @Test
        @DisplayName("Verificar que la inscripcion fue aprobada")
        public void fueAprobada() {

            facu.agregarMateriaAprobada(am1);
            facu.agregarMateriaAprobada(aga);
            facu.agregarMateriaAprobada(f1);
            Inscripcion inscripcion = new Inscripcion(facu, Arrays.asList(am2, f2));                    //instancio mi inscripcion


            //verifico que la inscripcion fue aprobada
            assertTrue(inscripcion.fueAprobada());
            assertTrue(inscripcion.fueAprobada1());
            assertTrue(inscripcion.fueAprobada2());
            //los 3 para ver si funcionan los 3 methods
        }


        @Test
        @DisplayName("Verificar que la inscripcion no fue aprobada")
        public void fueDesaprobada() {

        facu.agregarMateriaAprobada(am1);
        facu.agregarMateriaAprobada(f1);//instancio al alumno(a mi)
        Inscripcion inscripcion = new Inscripcion(facu, Arrays.asList(am2, f2));                    //instancio mi inscripcion


        //verifico que la inscripcion no fue aprobada
        assertFalse(inscripcion.fueAprobada());
        assertFalse(inscripcion.fueAprobada1());
        assertFalse(inscripcion.fueAprobada2());
        //los 3 para ver si funcionan los 3 methods

        }
}