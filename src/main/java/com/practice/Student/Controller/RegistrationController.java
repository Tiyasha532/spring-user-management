package com.practice.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.practice.Student.Service.RegistrationService;

@Controller

@RequestMapping("/registration")
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping
	public ModelAndView showPage() {
		//System.out.println("abcd");
		// ModelAndView mv = new ModelAndView("login");
		return new ModelAndView("registration");
		// return mv;

	}
	@ResponseBody
	@PostMapping("/submit")
	public String submit(@RequestParam("uname") String userName, @RequestParam("txt-password1") String password, @RequestParam("txt-password2") String cpassword) {
		String response = "";
		System.out.println("Username:"+userName+"Password:"+password+"ConfirmPassword:"+cpassword);
		response = registrationService.registrationSubmit(userName, password, cpassword);
		System.out.println(response);
		return response;
	}

}
