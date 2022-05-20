package com.practice.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Student.Model.User;
import com.practice.Student.Repository.LoginRegistrationRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRegistrationRepository loginRepository;

	public String submit(User user) {
		String response = "";
		int index = -1;
		String username = user.getUsername();
		String password = user.getPassword();

		List<Object[]> rs = loginRepository.getAllUsernamePassword();
		Boolean isUsernameCorrect = false;
		Boolean isPasswordCorrect = false;
		for (int i = 0; i < rs.size(); i++) {

			if (username.equalsIgnoreCase((String) rs.get(i)[0])) {

				isUsernameCorrect = true;
				index = i;
				break;
			}
		}

		if (isUsernameCorrect && password.equals((String) rs.get(index)[1])) {

			response = "Password Matched";
		} else if (isUsernameCorrect) {

			response = "Password not matched";
		} else {

			response = "Username Not Found";

		}

		return response;

	}
	
	public String submitV1(String username, String password) {
		String response = "";
		//int index = -1;
		//String username = user.getUsername();
		//String password = user.getPassword();

		//long rs = loginRepository.findByUsername(username);
		if(loginRepository.findByUsername(username)>0) {
			//response = "Username found";
		
			if(loginRepository.findPasswordByUsername(username).equals(password)) {
				response = "Password Matched";
			}
			else {
				response = "Password not matched";
			}
		}
		else {
			response = "Username not found";
		}

		

		return response;

	}
	
	

	public String registrationSubmit(String userName, String password, String cpassword) {
		
		String response ="";
		if(loginRepository.findByUsername(userName)>0)
		{
			response = "Username:"+userName+" is already exist";
		}
		else
		{
			if(password.equals(cpassword))
			{
				if(loginRepository.insertUsernamePassword(userName,password)==1)
				{
					response = "Registration successful";
				}
				else
				{
					response = "Registration failure";
				}
			}
			else
			{
				response = "Password not matched";
			}
		}
		return response;
	}


}

