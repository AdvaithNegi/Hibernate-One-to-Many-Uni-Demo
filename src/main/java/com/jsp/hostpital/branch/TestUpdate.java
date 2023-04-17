package com.jsp.hostpital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = entityManager.find(Hospital.class, 3);
		hospital.setName("Kokilaben");
		hospital.setGst_number("123KO456");

		Branch branch = entityManager.find(Branch.class, 7);
		branch.setLoc("Khanda Colony");

		entityTransaction.begin();
		entityManager.merge(hospital);
		entityManager.merge(branch);
		entityTransaction.commit();

	}
}
