package com.myp.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myp.domain.RegiVO;
import com.myp.service.RegiService;

@Controller
public class MemberController {
	
	@Inject   // ����(�ɺθ���) ���
	private RegiService service; // Service ȣ���� ���� ��ü����
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register() throws Exception{
	
	}
	
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public void regi(RegiVO vo) throws Exception{
		service.regi(vo);
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() throws Exception{
	
	}
	
	
	
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public ModelAndView login(RegiVO vo,HttpSession session) throws Exception{
		RegiVO vo2 = service.login(vo);
		System.out.println(vo2.getPass());
		if(vo.getPass().equals(vo2.getPass())) {
			System.out.println("������");
			
		}else {
			System.out.println("����");
		}
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("list", vo2);
		
		return mv;
	}
	

}
