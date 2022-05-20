package com.practice.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Student.Repository.LoginRegistrationRepository;

@Service
public class ModificationService {
	
	@Autowired
	private LoginRegistrationRepository loginRegistrationRepository;
	
	public String modificationSubmit(String userName, String cupassword, String npassword, String cpassword) {
		
		String response = "";
		if(loginRegistrationRepository.findByUsername(userName)>0) {
			//response = "Username Found";
			if(loginRegistrationRepository.findPasswordByUsername(userName).equals(cupassword)) {
				//response = "current password matched";
				if(npassword.equals(cpassword)) {
					//response = "new and confirm password matched";
					if(loginRegistrationRepository.updatePassword(npassword,userName)==1) {
						response = "password updated";
					}
					else {
						response = "password not updated";
					}
				}
				else {
					response = "new and confirm password not matched";
				}
			}
			else {
				response = "current password not matched";
			}
		}
		else {
			response = "username not found";
		}
				
		return response;
	}
	
}
