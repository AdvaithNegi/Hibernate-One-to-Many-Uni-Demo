package com.jsp.hostpital.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Branch> al = new ArrayList<Branch>();

		Branch branch1 = new Branch();
		branch1.setLoc("Vashi");

		Branch branch2 = new Branch();
		branch2.setLoc("Thane");

		Branch branch3 = new Branch();
		branch3.setLoc("Panvel");

		al.add(branch1);
		al.add(branch2);
		al.add(branch3);

		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setGst_number("AP1275LO");
		hospital.setBranchs(al);

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();

	}
}
