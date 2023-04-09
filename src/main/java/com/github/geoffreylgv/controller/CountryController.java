/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.geoffreylgv.controller;

import com.github.geoffreylgv.entity.Country;
import com.github.geoffreylgv.repository.CountryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author geoffreylgv < geoffrey.logovi@studentambassadors.com;
 * geoffreylogovi2@gmail.com
 */
@RestController
@RequestMapping(value = "/api/country/v1/countries")
public class CountryController {

    @Autowired
    CountryRepository countryRepo;

    //get all countries
    @GetMapping("/")
    public ResponseEntity getAll() {
        List<Country> listCountry = countryRepo.findAll();
        if (!listCountry.isEmpty()) {
            return new ResponseEntity(listCountry, HttpStatus.OK);
        }
        return new ResponseEntity("Not found error", HttpStatus.NOT_FOUND);
    }

    //get country by id
    @GetMapping("/{id}")
    public ResponseEntity getCountryById(@PathVariable("id") Long id) {
        Optional<Country> listCountry = countryRepo.findById(id);
        return listCountry.map(c -> new ResponseEntity<>(c, HttpStatus.OK))
                .orElse(new ResponseEntity("Country Not Found !", HttpStatus.NOT_FOUND));
    }

    //get country by name
    @GetMapping("/by/name")
    public ResponseEntity getCountryByName(@RequestParam(value = "name") String search) {
        return new ResponseEntity<>(countryRepo.findLikeName(search), HttpStatus.OK);
    }

    //get country by any libelle searched
    @GetMapping("/by/occurence")
    public ResponseEntity getCountryByOccurenceSearched(@RequestParam(value = "search") String search) {
        return new ResponseEntity<>(countryRepo.findCountryLikeLibelleSearch(search), HttpStatus.OK);
    }
}
