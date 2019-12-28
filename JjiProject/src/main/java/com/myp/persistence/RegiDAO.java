package com.myp.persistence;

import com.myp.domain.RegiVO;

public interface RegiDAO {
	
	public void regi(RegiVO vo) throws Exception;
	public RegiVO login(RegiVO vo) throws Exception;

}
