package com.myp.service;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.myp.domain.RegiVO;
import com.myp.persistence.RegiDAO;

@Service
public class RegiServiceImpl implements RegiService {

	 @Inject
	  private RegiDAO dao;


	@Override
	public void regi(RegiVO vo) throws Exception {
		dao.regi(vo);
	}



	@Override
	public RegiVO login(RegiVO vo) throws Exception {
		
		return dao.login(vo);
	}


		

}
