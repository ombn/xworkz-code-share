package com.xworkz.airport.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.airport.dto.AirHostessDTO;

public class AirHostessDAOImpl implements AirHostessDAO {

	public AirHostessDAOImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public void store(AirHostessDTO dto) {
		try {
			System.out.println("invoked store" + dto);
			Configuration cfg = new Configuration();
			cfg.configure("resources/mysql.xml");
			cfg.addAnnotatedClass(AirHostessDTO.class);
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(dto);
			Transaction tx = session.getTransaction();
			tx.commit();
			session.close();
			factory.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void understand() {
		// AirHostessDAO.super.understand();
		System.out.println("invoked understand from implementor");

		Configuration configuration = new Configuration();
		configuration.configure("resources/mysql.xml");
		configuration.addAnnotatedClass(AirHostessDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		// create Impl of SessionFactory
		// create connection pool
		// manage entities
		// create session's
Session session=factory.openSession();
		
		
		
	}

	@Override
	public AirHostessDTO fetchById(int aid) {
		try {
			System.out.println("invoked fetchById" + aid);
			Configuration cfg = new Configuration();
			cfg.configure("resources/mysql.xml");
			cfg.addAnnotatedClass(AirHostessDTO.class);
			SessionFactory fac = cfg.buildSessionFactory();
			Session session = fac.openSession();
			session.beginTransaction();
			AirHostessDTO entity = session.get(AirHostessDTO.class, aid);
			session.getTransaction().commit();
			session.close();
			fac.close();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
