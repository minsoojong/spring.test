package com.sksalstn.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sksalstn.test.jsp.Service.SellerService;
import com.sksalstn.test.jsp.domain.Seller;

@Controller
public class SellerController {
	
//	@Autowired
//	private SellerService sellerService;
//	
//	public String createSellrt(
//			@RequestParam("nickname") String nickname
//			, @RequestParam("profileImge") String profileImge
//			, @RequestParam("temperature") double temperature) 
//	
//
//	@GetMapping("/input")
//	public String sellerInput () {
//		return "jsp/sellerInput";
//	}


	
	
//	@GetMapping("/last")
//	public String lastSeller(Model model) {
//		
//		Seller seller = sellerService.getLastSeller();
//		model.addAttribute("seller", seller);
//		
//		return "jsp/sellerInfo";
//	
//}
	
//	public Seller getSeller(int id) {
//		
//	}

//	@GetMapping("/info")
//	public String sellerInfo(
//			@RequestParam(value="id", required=false) Integer id
//			, Model model) {
//		Seller seller = null;
//		// id 파라미터가 있으면, id와 일치하는 판매자 정보 
//		if(id != null) {
//			seller = sellerService.getSeller(id);
//			model.addAttribute("seller", seller);
//		} else {  // id 파라미터가 없으면, 최근 등록한 판매자 정보
//			seller = sellerService.getLastSeller();
//			model.addAttribute("seller", seller);
//			
//		}
//		
//		
//		return "/jsp/sellerInfo";
//	}
	
	
	
}
