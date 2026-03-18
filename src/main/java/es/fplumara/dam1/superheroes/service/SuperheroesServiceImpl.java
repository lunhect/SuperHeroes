package es.fplumara.dam1.superheroes.service;

import es.fplumara.dam1.superheroes.model.Franquicia;
import es.fplumara.dam1.superheroes.model.Superheroes;
import es.fplumara.dam1.superheroes.repository.SuperheroesRepository;
import java.util.List;
import java.util.Optional;

public class SuperheroesServiceImpl implements SuperHeroesService {

    private SuperheroesRepository superheroesRepository;

    public SuperheroesServiceImpl(SuperheroesRepository superheroesRepository) {
        this.superheroesRepository = superheroesRepository;
    }

    @Override
    public Superheroes crearSuperHeroe(Long id, String nombre, String apodo, Franquicia franquicia, String poder) {
        // Validaciones
        if (existsByNombreYApodo(nombre, apodo)) {
            throw new IllegalArgumentException("Ya existe un superhéroe con ese nombre y apodo");
        }
        return superheroesRepository.crearSuperHeroe(id, nombre, apodo, franquicia, poder);
    }

    @Override
    public void guardarSuperHeroe(Superheroes superheroe) {
        superheroesRepository.guardarSuperHeroe(superheroe);
    }

    @Override
    public Optional<Superheroes> findByNombre(String nombre) {
        return superheroesRepository.findByNombre(nombre);
    }

    @Override
    public Optional<Superheroes> findByApodo(String apodo) {
        return superheroesRepository.findByApodo(apodo);
    }

    @Override
    public List<Superheroes> findByPoder(String poder) {
        return superheroesRepository.findByPoder(poder);
    }

    @Override
    public List<Superheroes> findByFranquicia(String franquicia) {
        return superheroesRepository.findByFranquicia(franquicia);
    }

    @Override
    public boolean existsByNombreYApodo(String nombre, String apodo) {
        return superheroesRepository.existsByNombreYApodo(nombre, apodo);
    }

    @Override
    public long countByFranquicia(Franquicia franquicia) {
        return superheroesRepository.countByFranquicia(franquicia);
    }

    @Override
    public void deleteSuperheroe(Long id) {
        superheroesRepository.deleteSuperheroe(id);
    }


}