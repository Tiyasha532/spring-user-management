package com.practice.Student.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/modificationV1")
public class ModificationControllerV1 {
	
	
	@GetMapping
	public ModelAndView showPage() {
		return new ModelAndView("Modification_V1");
	}
	
	

}
