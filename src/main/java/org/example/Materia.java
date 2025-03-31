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
public class Materia {
    private String nombre;
    private List<Materia> correlativas;
}

//no tiene methods pq solo uso el getter de la lista de correlativas.