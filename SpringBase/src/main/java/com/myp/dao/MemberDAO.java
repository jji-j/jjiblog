package com.myp.dao;


import java.util.Map;


public interface MemberDAO {
	
		public int create(Map<String, Object> param) throws Exception; 
		public Map<String, Object> loginCheck(Map<String, Object> param) throws Exception;
}
