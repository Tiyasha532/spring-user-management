package com.practice.Student.Repository;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class LoginRegistrationRepository {

	@PersistenceContext
	EntityManager entityManager;

	public List<Object[]> getAllUsernamePassword() {

		Query query = entityManager.createNativeQuery("select username, password from student");
		List<Object[]> rs = query.getResultList();
		return rs;
	}

	public long findByUsername(String username) {
		long rs = 0;
		Query query = entityManager
				.createNativeQuery("select count(*) from student where upper(username) = upper(:username)");
		query.setParameter("username", username);
		// query.setParameter(1, username);
		List<Object> data = query.getResultList();
		if (data != null && data.size() > 0) {
			rs = ((BigInteger) data.get(0)).longValue();
		}
		return rs;
	}

	public String findPasswordByUsername(String username) {
		String rs = "";
		Query query = entityManager
				.createNativeQuery("select password from student where upper(username) = upper(:username)");
		query.setParameter("username", username);
		List<Object> data = query.getResultList();
		if (data != null && data.size() > 0) {
			rs = (String) data.get(0);

		}
		return rs;
	}
	@Transactional
	public int insertUsernamePassword(String username , String password) {
		Query query = entityManager
				.createNativeQuery("insert into student (USERNAME,PASSWORD) values(:username,:password)");
		query.setParameter("username", username);
		query.setParameter("password", password);
		int count = 0;
		try
		{
			count=query.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return count;
	}
	
	@Transactional
	public int updatePassword(String password, String username) {
		//long rs=0;
		Query query = entityManager.createNativeQuery("update student set password = :password where username = :username");
		query.setParameter("username", username);
		query.setParameter("password", password);
		int count = 0;
		try
		{
			count=query.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return count;
	}
	
}