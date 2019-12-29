package com.myp.service;

import java.util.Map;

import javax.servlet.http.HttpSession;


public interface MemberService {

	public int create(Map<String, Object> param) throws Exception;
	public String loginCheck(Map<String, Object> param, HttpSession session) throws Exception;
}
