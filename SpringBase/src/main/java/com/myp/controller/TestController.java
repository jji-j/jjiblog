package com.myp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // ��Ʈ�ѷ����� ���
@RequestMapping(value = "/") // �ּ� ����
public class TestController {
	
	
	@RequestMapping("/test")
	public String test() throws Exception{
			
		return "test";
	}
	

}
