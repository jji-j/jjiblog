package com.myp.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.myp.dao.BoardDAO;
import com.myp.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	 @Inject
	  private BoardDAO dao;

	@Override
	public void boardInsert(BoardVO vo) throws Exception {
		
		dao.boardInsert(vo);
	}

	@Override
	public List<Map<String, Object>> selectBoard(BoardVO vo) throws Exception {
		
		List<Map<String, Object>> vo1 = dao.selectBoard(vo);
	
		return vo1;
	}

}
