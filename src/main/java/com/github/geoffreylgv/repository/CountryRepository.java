/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.geoffreylgv.repository;

import com.github.geoffreylgv.entity.Country;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author geoffreylgv < geoffrey.logovi@studentambassadors.com;
 * geoffreylogovi2@gmail.com
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    //find countries search like name
    @Query(value = "select c from Country c "
            + "where c.nameEN like %:name% or c.nameFR like %:name% ")
    public List<Country> findLikeName(@Param("name") String name);

    //find countries by any search, just enter a libelle and it will return countries of match
    @Query(value = "select * from countries c where c.name_en like %:search% "
            + "or c.name_fr like %:search% or c.alpha2 like %:search% "
            + "or c.code like %:search% or c.alpha3 like %:search% ", nativeQuery = true)
    public List<Country> findCountryLikeLibelleSearch(@Param("search") String search);
}
