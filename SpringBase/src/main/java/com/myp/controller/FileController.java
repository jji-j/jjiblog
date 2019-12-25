package com.myp.controller;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/") 
public class FileController {

	@Resource(name="uploadPath")
	private String uploadPath;
	
	@RequestMapping(value = "/file", method = RequestMethod.GET)
	public String filee() throws Exception{
	
		return "/fileUpload";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String file(MultipartFile file, Model model) throws Exception{
		System.out.println(file.getBytes());
		String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
		System.out.println("ssss"+ savedName);
		model.addAttribute("savedName", savedName);
		
		return "/uploadResult";
	}
	
	private String uploadFile(String originalName, byte[] fileData)	throws Exception{

		UUID uid = UUID.randomUUID();//랜덤한 uid(이름같은번호)를 부여할 준비
		String savedName = uid.toString() + "_" + originalName;//123_이진사진.jpg
		File target = new File(uploadPath, savedName);// 업로드패스 경로에 해당이름으로//비어있는 파일을 생성
		FileCopyUtils.copy(fileData, target);//생성했던 파일에 가져온 데이터를 주입하여 완전한 파일로 만듦

		return savedName;//업로드가 완료된 파일 이름을 스트링값으로 리턴
	}
	
	

}
