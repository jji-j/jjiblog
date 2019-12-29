package com.myp.dao;


import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myp.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.myp.mapper.memberRegistMapper";
	
	@Override
	public void boardInsert(BoardVO vo) throws Exception {
		
		 session.insert(namespace+".boardInsert", vo);
		
	}

	@Override
	public List<Map<String, Object>> selectBoard(BoardVO vo) throws Exception {
		return session.selectList(namespace+".selectBoard",vo);
		
	}



}
