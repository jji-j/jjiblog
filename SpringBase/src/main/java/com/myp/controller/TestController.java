package com.myp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // 컨트롤러임을 명시
@RequestMapping(value = "/") // 주소 패턴
public class TestController {
	
	
	@RequestMapping("/test")
	public String test() throws Exception{
			
		return "test";
	}
	

}
