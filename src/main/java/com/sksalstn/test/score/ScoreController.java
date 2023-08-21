package com.sksalstn.test.score;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/score/test01")
@RestController
public class ScoreController {
	
	@ResponseBody
	@RequestMapping("/1")
	public String welcome() {
		return "<h1>테스트 프로젝트 완성</h1><h2>해당 프로젝트를 통해서 문제 풀이를 진행합니다.</h2>";
		
	}
	
	@RequestMapping("/2")
	public Map<String, Integer> mapResponse(){
		Map<String, Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("국어", 80);
		scoreMap.put("수학", 90);
		scoreMap.put("영어", 85); 
		
		return scoreMap;
	}

	
}
