package com.myp.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myp.domain.TestVO;

@Repository
public class TestDAOImpl implements TestDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.myp.mapper.TestMapper";


	@Override
	public List<TestVO> selectTest() throws Exception {
		return session.selectList(namespace + ".selectTest");
	}


}

