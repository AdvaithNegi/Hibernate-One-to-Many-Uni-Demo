package com.jsp.hostpital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Hospital hospital = entityManager.find(Hospital.class, 2);

		System.out.println("Hospital ID       : " + hospital.getId());
		System.out.println("Hospital Name     : " + hospital.getName());
		System.out.println("Hospital GST_NO   : " + hospital.getGst_number());
		

	}
}
