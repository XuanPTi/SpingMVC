package com.github.truongbb.dao;


import com.github.truongbb.entity.Driver;
import com.github.truongbb.utils.hibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.List;
import java.util.Queue;

@Repository
public class DriverRepository {
	public List<Driver> getAll(){
		try (Session session = hibernateUtils.getSessionFactory().openSession()){
			return session.createQuery("from Driver").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean insert(Driver driver) {

		try(Session session = hibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();
			session.save(driver);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Driver findById(int id) {
		try(Session session = hibernateUtils.getSessionFactory().openSession()) {
			Query<Driver> query = session.createQuery("from Driver where id=:driver_id");
			query.setParameter("driver_id", id);
			return query.getSingleResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

  public Boolean deleteById(int id) {
    try(Session session = hibernateUtils.getSessionFactory().openSession()) {
      session.beginTransaction();
      Driver driver = (Driver)session.load(Driver.class, id);
//      Query<Driver> queue = session.createQuery("DELETE Driver WHERE id =:diver_id");
//      queue.setParameter("diver_id",id);
      session.delete(driver);
      session.getTransaction().commit();
      return true;
    } catch (HibernateException e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean update(Driver driver) {

    try(Session session = hibernateUtils.getSessionFactory().openSession()) {
      session.beginTransaction();
      session.update(driver);
      session.getTransaction().commit();
      return true;
    } catch (HibernateException e) {
      e.printStackTrace();
    }
    return false;
  }
}
