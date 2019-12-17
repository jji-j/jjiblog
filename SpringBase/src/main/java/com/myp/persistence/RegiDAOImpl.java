package com.myp.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myp.domain.RegiVO;

@Repository
public class RegiDAOImpl implements RegiDAO {
	
	
	@Inject
	private SqlSession session;

	private static String namespace = "com.myp.mapper.RegiMapper";

	@Override
	public void regi(RegiVO vo) throws Exception {
		session.insert(namespace+".regi", vo);
		
	}
	

	@Override
	public RegiVO login(RegiVO vo) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".login", vo);
	}
	
	

}
