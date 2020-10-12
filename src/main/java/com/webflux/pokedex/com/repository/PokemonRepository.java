package com.webflux.pokedex.com.repository;

import com.webflux.pokedex.com.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String>{

}
