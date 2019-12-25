package com.myp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.myp.persistence.TestDAO;
import com.myp.domain.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestVO> TestId() throws Exception {
		
		return dao.selectTest();
	}
	

}
