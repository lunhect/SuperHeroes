package es.fplumara.dam1.superheroes.repository;

import es.fplumara.dam1.superheroes.model.Franquicia;
import es.fplumara.dam1.superheroes.model.Superheroes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SuperHeroesRepositoryImpl implements SuperheroesRepository{

    Map<Long,Superheroes> superheroesMap = new HashMap<>();

    @Override
    public Superheroes crearSuperHeroe(Long id, String nombre, String apodo, Franquicia franquicia, String poder) {

        Superheroes superheroes = new Superheroes(id, nombre, apodo, franquicia, poder);

        return superheroesMap.put(id,superheroes);
    }

    @Override
    public void guardarSuperHeroe(Superheroes superheroe) {
        superheroesMap.put(superheroe.getId(), superheroe);
    }

    @Override
    public Optional<Superheroes> findByNombre(String nombre) {
        return Optional.ofNullable(superheroesMap.get(nombre));
    }

    @Override
    public Optional<Superheroes> findByApodo(String apodo) {
        return Optional.ofNullable(superheroesMap.get(apodo));
    }

    @Override
    public List<Superheroes> findByPoder(String poder) {
        return superheroesMap.values().stream().filter(s -> s.getPoder().equalsIgnoreCase(poder)).collect(Collectors.toList());
    }

    @Override
    public List<Superheroes> findByFranquicia(String franquicia) {
        return superheroesMap.values().stream().filter(f -> f.getFranquicia().equals(franquicia)).collect(Collectors.toList());
    }

    @Override
    public boolean existsByNombreYApodo(String nombre, String apodo) {
        return superheroesMap.values().stream().anyMatch(s -> s.getNombre().equalsIgnoreCase(nombre) && s.getApodo().equalsIgnoreCase(apodo));
    }


    @Override
    public long countByFranquicia(Franquicia franquicia) { // el filter espera un boolean
        return superheroesMap.values().stream().filter(f -> f.getFranquicia() == franquicia).count();
    }

    @Override
    public void deleteSuperheroe(Long id ) {
        superheroesMap.remove(id);
    }
}

