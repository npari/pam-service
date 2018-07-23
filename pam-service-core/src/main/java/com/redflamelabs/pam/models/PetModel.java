package com.redflamelabs.pam.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

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
    @Relationship(type = "LIVED_IN")
    private Set<PetLocationModel> petLocations;

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

    public Set<PetLocationModel> getPetLocations() {
        return petLocations;
    }

    public void setPetLocation(Set<PetLocationModel> petLocations) {
        this.petLocations = petLocations;
    }
}
