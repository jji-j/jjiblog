package com.myp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myp.domain.BoardVO;
import com.myp.persistence.BoardDAO;

public class TestServiceImpl implements TestService {
	
	@Autowired
	private BoardDAO dao;

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);

	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}

}
