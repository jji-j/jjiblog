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

		UUID uid = UUID.randomUUID();//������ uid(�̸�������ȣ)�� �ο��� �غ�
		String savedName = uid.toString() + "_" + originalName;//123_��������.jpg
		File target = new File(uploadPath, savedName);// ���ε��н� ��ο� �ش��̸�����//����ִ� ������ ����
		FileCopyUtils.copy(fileData, target);//�����ߴ� ���Ͽ� ������ �����͸� �����Ͽ� ������ ���Ϸ� ����

		return savedName;//���ε尡 �Ϸ�� ���� �̸��� ��Ʈ�������� ����
	}
	
	

}
