package com.redflamelabs.pam.repositories;

import com.redflamelabs.pam.models.CatModel;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by nithyapari on 3/19/18.
 */

public interface CatRepository extends GraphRepository<CatModel> {

    @Query("MATCH (n:CatModel) where n.name={0} RETURN n")
    Iterable<CatModel> findByName(String name);

}
