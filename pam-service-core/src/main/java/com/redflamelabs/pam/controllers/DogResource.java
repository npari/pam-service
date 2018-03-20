package com.redflamelabs.pam.controllers;

import com.redflamelabs.pam.models.DogModel;
import com.redflamelabs.pam.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Method: createDog
     * @param dogModel
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity<DogModel> createDog(@RequestBody DogModel dogModel) {
        DogModel dog = dogRepository.save(dogModel);
        return new ResponseEntity<>(dog, HttpStatus.OK);
    }

    /**
     * Method: findDogByName
     * @param dogName
     * @return
     */
    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    ResponseEntity<Iterable<DogModel>> findDogByName(@RequestParam("name") String dogName) {
        Iterable<DogModel> dogs = dogRepository.findByName(dogName);
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }
}
