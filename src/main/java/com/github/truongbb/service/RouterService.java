package com.github.truongbb.service;
import com.github.truongbb.dao.RouterRepository;
import com.github.truongbb.entity.Router;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouterService {
	RouterRepository routerRepository = new RouterRepository();
	
	public List<Router> getAll(){
		return routerRepository.getAll();
	}
	
	public boolean insert(Router router) {
		
		return routerRepository.insertRouter(router);
	}
	
	public Router findRouterId(int id) {
        return routerRepository.findById(id);
    }
  public Boolean update(Router router){
    return routerRepository.update(router);
    }
  public Boolean delete(int id){
    return routerRepository.delete(id);
  }
}
