package com.practice.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Student.Repository.DeleteRepository;
import com.practice.Student.Repository.LoginRegistrationRepository;

@Service
public class DeleteService {
	@Autowired
	private DeleteRepository deleteRepository;
	@Autowired
	private LoginRegistrationRepository loginRegistrationRepository;
	
	public String delete(String userName, String password) {
		String response = "";
		if(loginRegistrationRepository.findByUsername(userName)>0) {
			if(loginRegistrationRepository.findPasswordByUsername(userName).equals(password)) {
				if(deleteRepository.deleteUser(userName)==1) {
					response = userName+" is deleted";
				}
				else {
					response = userName+" is not deleted";
				}
			}
		}
		return response;
	}
}

