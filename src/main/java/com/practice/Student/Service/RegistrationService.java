package com.practice.Student.Service;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Student.Repository.LoginRegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private LoginRegistrationRepository loginRegistrationRepository;
	
	public String registrationSubmit(String userName, String password, String cpassword) {
		
		String response ="";
		if(loginRegistrationRepository.findByUsername(userName)>0)
		{
			System.out.println("a");

			response = "Username:"+userName+" is already exist";
		}
		else
		{
			System.out.println("b");
			if(password.equals(cpassword))
			{
				System.out.println("c");
				if(loginRegistrationRepository.insertUsernamePassword(userName,password)==1)
				{
					System.out.println("e");
					response = "Registration successful";
				}
				else
				{
					System.out.println("f");
					response = "Registration failure";
				}
			}
			else
			{
				System.out.println("d");
				response = "Password not matched";
			}
		}
		System.out.println("service:"+response);
		return response;
	}

}
