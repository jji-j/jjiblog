package com.myp.persistence;

import java.util.List;

import com.myp.domain.TestVO;

public interface TestDAO {
	
	public List<TestVO> selectTest() throws Exception;

}