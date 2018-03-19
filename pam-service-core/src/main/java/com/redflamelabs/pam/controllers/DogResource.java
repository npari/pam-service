package com.redflamelabs.pam.controllers;

import com.redflamelabs.pam.models.DogModel;
import com.redflamelabs.pam.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling requests for dogs
 *
 * Created by kavinarasu on 3/18/18.
 */
@RestController
@RequestMapping(value = "/dogs", consumes = "application/json", produces = "application/json")
public class DogResource {

    @Autowired
    private DogRepository dogRepository;
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity<DogModel> createDog(@RequestBody DogModel dogModel) {
        DogModel successModel = dogRepository.save(dogModel);
        return new ResponseEntity<>(successModel, HttpStatus.OK);
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    ResponseEntity<Iterable<DogModel>> findDogByName(String name) {
        Iterable<DogModel> dogs = dogRepository.findByName(name);
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }
}
