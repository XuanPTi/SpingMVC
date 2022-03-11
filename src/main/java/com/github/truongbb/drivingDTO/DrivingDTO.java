package com.github.truongbb.drivingDTO;

import com.github.truongbb.entity.Driver;
import com.github.truongbb.entity.Router;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class DrivingDTO {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;


  private Integer driver_id;

  private Integer router_id;

  private  Integer turnNumber;
}
