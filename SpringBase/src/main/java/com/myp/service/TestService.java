package com.myp.service;

import java.util.List;

import com.myp.domain.BoardVO;

public interface TestService {
	
	 public BoardVO read(Integer bno) throws Exception;
	 public List<BoardVO> listAll() throws Exception;
}
