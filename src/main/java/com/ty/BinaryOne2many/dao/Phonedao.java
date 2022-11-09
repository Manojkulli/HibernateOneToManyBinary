package com.ty.BinaryOne2many.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.BinaryOne2many.dto.Phone;
import com.ty.BinaryOne2many.dto.Sim;

public class Phonedao {

	public void savePhone(Phone phone){
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(phone);
		for (Sim a : phone.getSim()) {
			entityManager.persist(a);
		}
		entityTransaction.commit();
	}
}
