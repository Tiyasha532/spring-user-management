package com.practice.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.practice.Student.Model.User;
import com.practice.Student.Service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping
	public ModelAndView showPage() {
		System.out.println("abcd");
		// ModelAndView mv = new ModelAndView("login");
		return new ModelAndView("login");
		// return mv;

	}

	@PostMapping("/submit")
	public ModelAndView submit(@ModelAttribute User user) {
		// public String submit(@RequestParam("username") String userName,
		// @RequestParam("password") String password) {
		String response = "";
		response = loginService.submit(user);
		// return response;
		System.out.println(response);
		if (response.equals("Password Matched")) {

			return new ModelAndView("success");
		} else {
			return new ModelAndView("error");
		}
	}

	@ResponseBody
	@PostMapping("/submitV1")
	public String submitV1(@RequestParam("username") String userName, @RequestParam("password") String password) {
		String response = "";
		response = loginService.submitV1(userName, password);
		return response;
	
	}
	
	
	
	
	

}
