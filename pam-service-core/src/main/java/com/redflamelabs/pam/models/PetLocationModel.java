package com.redflamelabs.pam.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Model to store the location of pet for the given date time range
 *
 * Created by kavinarasu on 7/22/18.
 */
@NodeEntity
public class PetLocationModel {

    @GraphId
    private Long Id;

    private LocationModel location;
    private LocalDateTime startDate;
    private Optional<LocalDateTime> endDate;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Optional<LocalDateTime> getEndDate() {
        return endDate;
    }

    public void setEndDate(Optional<LocalDateTime> endDate) {
        this.endDate = endDate;
    }

    public Boolean isCurrent() {
        return endDate.isPresent();
    }
}
