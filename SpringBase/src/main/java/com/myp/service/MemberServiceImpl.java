package com.myp.service;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.myp.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	
	 @Inject
	  private MemberDAO dao;


	@Override
	public int create(Map<String, Object> param) throws Exception {

		System.out.println("서비스"+param);
			dao.create(param);
		return 0;
	}


	//페이지에서 받아온 param의 pass랑 sql에서 가져온 pass를 비교해서 
	@Override
	public String loginCheck(Map<String, Object> param, HttpSession session) throws Exception {
		
			String toPage = "redirect:/mLogin?fail=1";
			Map<String, Object> result = dao.loginCheck(param);
			System.out.println(result);
			if(result.get("pass").equals(param.get("pass"))) {
				session.setAttribute("id", param.get("id").toString());
				toPage = "redirect:/";
			}
		return toPage;
	}

}
