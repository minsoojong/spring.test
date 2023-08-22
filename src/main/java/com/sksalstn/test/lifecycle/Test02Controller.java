package com.sksalstn.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test02Controller {
	
	@RequestMapping("/lifecycle/test02")
	public String test02View() {
		return "lifecycle/test02";
	}

}

