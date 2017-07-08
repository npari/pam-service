package com.redflamelabs.pam.repositories;

import com.redflamelabs.pam.models.DogModel;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Repository class for database operations on Dog Model
 * 
 * Created by kavinarasu on 7/8/17.
 */
public interface DogRepository extends GraphRepository<DogModel> {
}
