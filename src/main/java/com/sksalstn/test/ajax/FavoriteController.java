package com.sksalstn.test.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavoriteController {
	
	@GetMapping("/ajax/favorite/input")
	public String favoriteInput() {
		return "ajax/favorite/input";	
		}

}
