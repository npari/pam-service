package com.redflamelabs.pam.repositories;

import com.redflamelabs.pam.models.DogModel;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Repository class for database operations on Dog Model
 * 
 * Created by kavinarasu on 7/8/17.
 */
public interface DogRepository extends GraphRepository<DogModel> {

    @Query("MATCH (n:DogModel) where n.name={0} RETURN n")
    Iterable<DogModel> findByName(String name);
}
