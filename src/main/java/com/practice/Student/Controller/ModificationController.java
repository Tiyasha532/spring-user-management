package com.practice.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.practice.Student.Service.ModificationService;

@Controller

@RequestMapping("/modification")
public class ModificationController {
	
	@Autowired
	private ModificationService modificationService;
	
	@GetMapping
	public ModelAndView showPage() {
		
		// ModelAndView mv = new ModelAndView("login");
		return new ModelAndView("modification");
		// return mv;

	}
	@ResponseBody
	@PostMapping("/submit")
	public String submit(@RequestParam("uname") String userName, @RequestParam("txt-password1") String cupassword, @RequestParam("txt-password2") String npassword, @RequestParam("txt-password3") String cpassword) {
		String response = "";
		System.out.println("Username:"+userName+" CurrentPassword:"+cupassword+" NewPassword:"+npassword+" ConfirmPassword:"+cpassword);
		response = modificationService.modificationSubmit(userName, cupassword, npassword, cpassword);
		System.out.println(response);
		return response;
	} 

}
