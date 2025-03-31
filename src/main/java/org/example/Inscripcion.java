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
public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;
    private Boolean fueAprobada;

    public boolean fueAprobada() {
        for (Materia materia : materiasAInscribir) {                //con for
            if (!alumno.puedeCursarMateria(materia)) {
                return false;
            }
        }
        return true;
    }

    public boolean fueAprobada1(){
        return this.materiasAInscribir.stream().allMatch(m -> this.alumno.puedeCursarMateria(m));  //con lambda
    }

    public boolean fueAprobada2(){
        return this.materiasAInscribir.stream().allMatch(alumno::puedeCursarMateria);               //sin lambda y mas facil de pensar
    }
}
