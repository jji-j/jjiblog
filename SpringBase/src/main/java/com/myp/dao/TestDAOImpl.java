package com.myp.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.myp.vo.TestVO;

public class TestDAOImpl implements TestDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.myp.mapper.TestMapper";


	@Override
	public TestVO selectTest() throws Exception {
		return session.selectOne(namespace + ".testId");
	}



}
