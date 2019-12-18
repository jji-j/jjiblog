package com.myp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myp.domain.BoardVO;
import com.myp.service.TestService;


@Controller // ��Ʈ�ѷ����� ���
@RequestMapping(value = "/") // �ּ� ����
public class TestController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping("/test")
	public String test() throws Exception{
		
//		ModelAndView mv = new ModelAndView("/controller/Test");
//		BoardVO vo = service.read(bno);
//		mv.addObject("list", vo);
				
		return "test";
	}
	

}
