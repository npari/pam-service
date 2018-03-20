package com.redflamelabs.pam.controllers;

import com.redflamelabs.pam.models.CatModel;
import com.redflamelabs.pam.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

/**
 * Created by nithyapari on 3/19/18.
 */

@RestController
@RequestMapping(value = "/cats", consumes="application/json", produces="application/json")
public class CatResource {

    @Autowired
    CatRepository catRepository;

    /**
     * Method: createCat
     * @param catModel
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    ResponseEntity<CatModel> createCat(@RequestBody CatModel catModel) {
        CatModel cat = catRepository.save(catModel);
        return new ResponseEntity<CatModel>(cat, HttpStatus.OK);
    }

    /**
     * Method: findCatByName
     * @param catName
     * @return
     */
    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    ResponseEntity<Iterable<CatModel>> findCatByName(@RequestParam("name") String catName) {
        Iterable<CatModel> cats = catRepository.findByName(catName);
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }

}
