package com.myp.persistence;

import com.myp.domain.TestVO;

public interface TestDAO {
	
	public TestVO selectTest() throws Exception;

}