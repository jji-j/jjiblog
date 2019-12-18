package com.myp.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myp.domain.BoardVO;
import com.myp.service.BoardService;


@Controller // ��Ʈ�ѷ����� ����
@RequestMapping(value = "/") // �ּ� ����
public class BoardController {

	
	@Inject   // ����(�ɺθ���) ����
	private BoardService service; // Service ȣ���� ���� ��ü����


	@RequestMapping(value= "/listAll", method = RequestMethod.GET) // �ּ� ȣ�� ���� . ȣ���Ϸ��� �ּ� �� REST ��ļ��� (GET)
	public void listAll(Model model)throws Exception { // �޼ҵ� ���ڰ��� model �������̽�(jsp���� �ɺθ���)

		model.addAttribute("list",service.listAll()); // jsp�� �ɺθ��� ����(���� ȣ��)

	}
	
	@RequestMapping(value = "/regist", method= RequestMethod.GET)
		public void registerGET(BoardVO board, Model model) throws Exception{
		
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
		public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.regist(board);
		return "redirect:/listAll";
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
		public void read(@RequestParam("bno")int bno, Model model) throws Exception{
			model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.modify(board);
		
		return "redirect:/listAll";
	}
	
	@RequestMapping(value = "remove", method = RequestMethod.POST)
	public String removePOST(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		service.remove(bno);
		
		return "redirect:/listAll";
	}
}