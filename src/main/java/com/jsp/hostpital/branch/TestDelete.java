package com.jsp.hostpital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = entityManager.find(Hospital.class, 2);

		Branch branch = entityManager.find(Branch.class, 4);

		entityTransaction.begin();
		entityManager.remove(hospital);
		entityManager.remove(branch);
		entityTransaction.commit();

	}
}
