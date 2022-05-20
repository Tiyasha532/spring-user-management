package com.practice.Student.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository

public class DeleteRepository {

	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public int deleteUser(String username) {
		Query query = entityManager.createNativeQuery("delete from student where username=:username");
		query.setParameter("username", username);
		int count = 0;
		try {
			count = query.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return count;
	}
}
