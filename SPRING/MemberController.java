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
	
	@Inject   // 주입(심부름꾼) 명시
	private RegiService service; // Service 호출을 위한 객체생성
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register() throws Exception{
	
	}
	
	// @리퀘스트 매핑의 밸류부분은, 사용자가 입력하는 주소를 받아오기도 하지만,
	// 왜 그런지 여기에서는 해당 이름과 같은 jsp 파일과 자동으로 연결시켜주기도 한다.
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public void regi(RegiVO vo) throws Exception{
		service.regi(vo);
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() throws Exception{
	
	}
	
	
	
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public ModelAndView login(RegiVO vo, HttpSession session) throws Exception{
		RegiVO vo2 = service.login(vo);
		System.out.println(vo2.getPass());
		if(vo.getPass().equals(vo2.getPass())) {
			session.setAttribute("id", vo2.getId());
		}else {
			System.out.println("실패");
		}
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("list", vo2);
		
		return mv;
	}
	

}
