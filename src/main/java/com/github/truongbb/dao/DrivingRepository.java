package com.github.truongbb.dao;

import com.github.truongbb.drivingDTO.DrivingDTO;
import com.github.truongbb.entity.Driver;
import com.github.truongbb.entity.Driving;
import com.github.truongbb.service.DriverService;
import com.github.truongbb.service.RouterService;
import com.github.truongbb.utils.hibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Queue;

@Repository
public class DrivingRepository {
  @Autowired
  private DriverService driverService;
  @Autowired
  private RouterService routerService;

	public List<Driving> getAll(){
		try(Session session = hibernateUtils.getSessionFactory().openSession()) {
      session.beginTransaction();
			return session.createQuery("from Driving ").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

  public Driving findbyid(int id){
    try (Session session = hibernateUtils.getSessionFactory().openSession()) {
      session.beginTransaction();
      Query<Driving> queue = session.createQuery("from Driving  where id =:driving_id");
      queue.setParameter("driving_id",id);
      return queue.getSingleResult();
    }catch (HibernateException h){
      h.printStackTrace();
    }
    return null;
  }

	public boolean insert(Driving driving) {
		try(Session session = hibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();

      DrivingDTO drivingDTO = new DrivingDTO();
      System.out.println(drivingDTO);
          driving.setDriver(driverService.findDriverById(drivingDTO.getDriver_id()));
      driving.setRouter(routerService.findRouterId(drivingDTO.getRouter_id()));
      driving.setTurnNumber(drivingDTO.getTurnNumber());
			session.save(driving);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}
  public boolean update(Driving driving) {
    try(Session session = hibernateUtils.getSessionFactory().openSession()) {
      session.beginTransaction();
      session.update(driving);
      session.getTransaction().commit();
      return true;
    } catch (HibernateException e) {
      e.printStackTrace();
    }
    return false;
  }

}
