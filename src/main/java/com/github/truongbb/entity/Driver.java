package com.github.truongbb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String level_driver;

    @OneToMany(mappedBy = "driver")
    private List<Driving> drivings;


  }

