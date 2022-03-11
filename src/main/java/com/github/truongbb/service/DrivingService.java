package com.github.truongbb.service;

import com.github.truongbb.dao.DrivingRepository;
import com.github.truongbb.drivingDTO.DrivingDTO;
import com.github.truongbb.entity.Driving;
import com.github.truongbb.utils.hibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrivingService {
  @Autowired
  private DriverService driverServiceer;

  @Autowired
  private RouterService routerService;

	public static DrivingRepository drivingRepository = new DrivingRepository();

	public List<Driving> getAll(){

    return drivingRepository.getAll();
	}
	
	public boolean insert(Driving drivingDTO) {
//
//      Driving driving = new Driving();
//      System.out.println(drivingDTO);
//      driving.setDriver(driverServiceer.findDriverById(drivingDTO.getDriver_id()));
//      driving.setRouter(routerService.findRouterId(drivingDTO.getRouter_id()));
//      driving.setTurnNumber(drivingDTO.getTurnNumber());
      return drivingRepository.insert(drivingDTO);
	}
  public boolean update(DrivingDTO drivingDTO){

    Driving driving = drivingRepository.findbyid(drivingDTO.getId());
    driving.setDriver(driverServiceer.findDriverById(drivingDTO.getDriver_id()));
    driving.setRouter(routerService.findRouterId(drivingDTO.getRouter_id()));
    driving.setTurnNumber(drivingDTO.getTurnNumber());

    return drivingRepository.update(driving);
  }

  public Driving findById(int id){
    return drivingRepository.findbyid(id);
  }
}
