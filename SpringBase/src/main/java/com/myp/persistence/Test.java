package com.myp.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myp.domain.BoardVO;

public interface Test {

	@Mapper
	public interface TestDAO {
		
		public BoardVO read(Integer bno) throws Exception;
		public List<BoardVO> listAll() throws Exception;

	}

}
