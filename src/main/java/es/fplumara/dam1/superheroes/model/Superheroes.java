package es.fplumara.dam1.superheroes.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.management.ConstructorParameters;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// esto en el services: @Slf4j. para mostrar con: log.

// @ConstructorParameters()
public  class Superheroes {

    private Long id;

    private String nombre;

    private String apodo;

    private Franquicia franquicia;

    private String poder;


}
