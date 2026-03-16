package es.fplumara.dam1.superheroes.repository;


import es.fplumara.dam1.superheroes.model.Superheroes;

import java.util.List;
import java.util.Optional;

public interface SuperheroesRepository {

    Optional<Superheroes> findByNombre(String nombre);

    Optional<Superheroes> findByApodo(String apodo);

    List<Superheroes> findByPoder(String poder);

    List<Superheroes> findByFranquicia(String franquicia);

    boolean existsByNombreYApodo(String nombre, String apodo);

    long countByFranquicia(String franquicia);

    void deleteSuperheroe(Long id, String nombre);

}
