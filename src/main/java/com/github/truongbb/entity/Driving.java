package com.github.truongbb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driving  implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @ManyToOne
  @JoinColumn(name = "driver_id")
  private Driver driver;

  @ManyToOne
  @JoinColumn(name = "router_id")
  private Router router;

  private int turnNumber;

}
