/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.geoffreylgv.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author geoffreylgv  < geoffrey.logovi@studentambassadors.com; geoffreylogovi2@gmail.com
 * >
 */
@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "COUNTRIES")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE", nullable = false, unique = true)
    private String code;
    @Column(name = "NAME_FR", nullable = false)
    private String nameFR;
    @Column(name = "NAME_EN", nullable = false)
    private String nameEN;
    @Column(name = "ALPHA2", nullable = false)
    private String alpha2;
    @Column(name = "ALPHA3", nullable = false)
    private String alpha3;
}
