package com.practice.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.practice.Student.Service.DeleteService;

@Controller
@RequestMapping("/deletion")
public class DeleteController {
	@Autowired
	private DeleteService deleteService;

	@GetMapping
	public ModelAndView showPage() {
		return new ModelAndView("deletion");
	}
	@ResponseBody
	@PostMapping("/delete")
	public String delete(@RequestParam("username") String userName, @RequestParam("password") String password) {
		String response = "";

		response = deleteService.delete(userName, password);
		return response;
	}
}
