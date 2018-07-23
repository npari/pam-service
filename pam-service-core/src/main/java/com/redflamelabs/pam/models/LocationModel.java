package com.redflamelabs.pam.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by kavinarasu on 7/9/17.
 */
@NodeEntity
public class LocationModel {

    @GraphId
    private Long Id;

    private Long lat;
    private Long lng;

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLng() {
        return lng;
    }

    public void setLng(Long lng) {
        this.lng = lng;
    }
}
