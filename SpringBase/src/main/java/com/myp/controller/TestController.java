package com.myp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myp.service.TestService;
import com.myp.domain.TestVO;


@Controller 
@RequestMapping(value = "/") 
public class TestController {
	
	@Inject 
	private TestService service;
	
//	
//	@RequestMapping("/test")
//	public String test() throws Exception{
//		return "/test";
//	}
	
	@RequestMapping("/tt")
	public ModelAndView test() throws Exception{
			
		ModelAndView mv = new ModelAndView("/test");
		TestVO vo = service.TestId();
		mv.addObject("TestVO", vo);
		return mv;
	}


}

