package com.myp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/") 
public class FileController {
	
	@RequestMapping(value = "/file", method = RequestMethod.POST)
	public String file(MultipartFile uploadfile) throws Exception{
		
		return "/fileUpload";
	}
	
	
	

}
