package com.myp.dao;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.myp.mapper.memberRegistMapper";
	


	@Override
	public int create(Map<String, Object> param) throws Exception {
		System.out.println(param);
			int test = session.insert(namespace+".create", param);
			System.out.println(test);
		return 0;
	}



	@Override
	public Map<String, Object> loginCheck(Map<String, Object> param) throws Exception {
		
		return 	session.selectOne(namespace+".loginCheck", param);
	}
}
