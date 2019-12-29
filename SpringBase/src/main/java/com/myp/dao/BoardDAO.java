package com.myp.dao;

import java.util.List;
import java.util.Map;

import com.myp.vo.BoardVO;

public interface BoardDAO {
	
	public void boardInsert(BoardVO vo) throws Exception;
	public List<Map<String, Object>> selectBoard(BoardVO vo) throws Exception;

}
