package es.fplumara.dam1.superheroes.repository;

import es.fplumara.dam1.superheroes.model.Superheroes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SuperHeroesRepositoryImpl implements SuperheroesRepository{

Map<Long,Superheroes> superheroesMap = new HashMap<>();

    @Override
    public Optional<Superheroes> findByNombre(String nombre) {
        return Optional.empty();
    }

    @Override
    public Optional<Superheroes> findByApodo(String apodo) {
        return Optional.empty();
    }

    @Override
    public List<Superheroes> findByPoder(String poder) {
        return List.of();
    }

    @Override
    public List<Superheroes> findByFranquicia(String franquicia) {
        return List.of();
    }

    @Override
    public boolean existsByNombreYApodo(String nombre, String apodo) {
        return false;
    }


    @Override
    public long countByFranquicia(String franquicia) {
        return 0;
    }

    @Override
    public void deleteSuperheroe(Long id, String nombre) {

    }
}
