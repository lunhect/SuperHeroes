package es.fplumara.dam1.superheroes.service;

import es.fplumara.dam1.superheroes.model.Franquicia;
import es.fplumara.dam1.superheroes.model.Superheroes;

import java.util.List;
import java.util.Optional;

public interface SuperHeroesService {
    Superheroes crearSuperHeroe(Long id, String nombre, String apodo, Franquicia franquicia, String poder);

    void guardarSuperHeroe(Superheroes superheroe);

    Optional<Superheroes> findByNombre(String nombre);

    Optional<Superheroes> findByApodo(String apodo);

    List<Superheroes> findByPoder(String poder);

    List<Superheroes> findByFranquicia(String franquicia);

    boolean existsByNombreYApodo(String nombre, String apodo);

    long countByFranquicia(Franquicia franquicia);

    void deleteSuperheroe(Long id);


}
