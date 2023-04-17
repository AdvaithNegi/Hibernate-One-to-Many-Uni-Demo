package com.jsp.hostpital.branch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select h from Hospital h";
		Query query = entityManager.createQuery(sql);
		List<Hospital> hospitals = query.getResultList();
		for (Hospital hospital : hospitals) {
			System.out.println("==========================================================");
			System.out.println("Hospital ID       : " + hospital.getId());
			System.out.println("Hospital Name     : " + hospital.getName());
			System.out.println("Hospital GST_NO   : " + hospital.getGst_number());
		}
	}
}
