package com.myp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myp.domain.BoardVO;


public interface BoardService {

		  public void regist(BoardVO board) throws Exception;
		  public BoardVO read(int bno) throws Exception;
		  public void modify(BoardVO board) throws Exception;
		  public void remove(int bno) throws Exception;
		  public List<BoardVO> listAll() throws Exception;
		

}
