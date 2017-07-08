package com.redflamelabs.pam.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Base Model for all pets
 *
 * Created by kavinarasu on 7/8/17.
 */
@NodeEntity
public abstract class PetModel {

    @GraphId
    private Long Id;
    private String name;
    private Double age;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
}
