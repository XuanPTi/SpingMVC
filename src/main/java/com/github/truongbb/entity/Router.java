package com.github.truongbb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Router implements Serializable {
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

  private int id;
  private String distance;
  private int stopPoint;
  private String name;

  @OneToMany(mappedBy = "router",cascade = CascadeType.ALL,
    orphanRemoval = true)
  private List<Driving> assignments;
  
}
