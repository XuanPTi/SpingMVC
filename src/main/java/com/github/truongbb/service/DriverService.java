package com.github.truongbb.service;
import com.github.truongbb.dao.DriverRepository;
import com.github.truongbb.entity.Driver;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverService {
	DriverRepository driverRepository = new DriverRepository();
	public List<Driver> getAll(){
		return driverRepository.getAll();
	}
	
	public boolean insert(Driver driver) {
		return driverRepository.insert(driver);
	}
	
	public Driver findDriverById(int id) {
    return driverRepository.findById(id);
    }


    public Boolean deleteById(int id){
    return driverRepository.deleteById(id);
    }

    public Boolean update(Driver driver){
    return driverRepository.update(driver);
    }
}
