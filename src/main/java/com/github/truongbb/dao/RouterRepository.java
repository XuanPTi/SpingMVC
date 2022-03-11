package com.github.truongbb.dao;


import com.github.truongbb.entity.Router;
import com.github.truongbb.utils.hibernateUtils;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class RouterRepository {
	public List<Router> getAll(){
		try(Session session = hibernateUtils.getSessionFactory().openSession()) {
			return session.createQuery("from Router").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean insertRouter(Router router) {
		try(Session session = hibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();
			session.save(router);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Router findById(int id) {
		try(Session session = hibernateUtils.getSessionFactory().openSession()) {
			Query<Router> query = session.createQuery("from Router where id=:router_id");
			query.setParameter("router_id", id);
			return query.getSingleResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
  public Boolean update(Router router){
    try(Session session = hibernateUtils.getSessionFactory().openSession()) {
      session.beginTransaction();
     session.update(router);
     session.getTransaction().commit();
    } catch (HibernateException e) {
      e.printStackTrace();
    }
    return false;
  }
  public Boolean delete(int id){
    try (Session session = hibernateUtils.getSessionFactory().openSession()) {
      session.beginTransaction();
      Router router = (Router)session.load(Router.class, id);
      session.delete(router);
      session.getTransaction().commit();
      return true;
    }catch (HibernateException h){
      h.printStackTrace();
    }
    return false;
  }
}
