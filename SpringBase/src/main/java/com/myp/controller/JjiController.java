package com.myp.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myp.service.BoardService;
import com.myp.service.MemberService;
import com.myp.vo.BoardVO;


@Controller
public class JjiController {
	

	@Inject   // ����(�ɺθ���) ���
	private MemberService service; // Service ȣ���� ���� ��ü����
	
	@Inject
	private BoardService Bservice; // Service ȣ���� ���� ��ü����
	
	//���������
	@RequestMapping("/")
	public String indexPage(HttpSession session, Model model) throws Exception {
		
		BoardVO vo = new BoardVO();
		if(session.getAttribute("id")!=null) {
			String id = session.getAttribute("id").toString();
			model.addAttribute("id", id);
			vo.setId(id);
			
			List<Map<String,Object>> selectBoard = Bservice.selectBoard(vo);
			System.out.println(selectBoard);
			model.addAttribute("list", selectBoard);
		}else {
			//�ڹٽ�ũ��Ʈ�� �α����ʿ��� �� alertâ ���� ����
			model.addAttribute("id", "�α����ʿ�");
		}
		
		return "/listAll";
	}
	
	//ȸ������������
	@RequestMapping("/memberRegist")
	public String mRegist() throws Exception{
		
		return "/memberRegist";
	}

	@RequestMapping(value ="/memberRegist.do", method = RequestMethod.GET)//ȸ�����Ե��۱���
	public String mbRegistDo(@RequestParam Map<String, Object> param) throws Exception{
		System.out.println(param);
		service.create(param);
		return "redirect:/";
	}
	
	//�α���������
	@RequestMapping("/mLogin")
	public String mLogin(@RequestParam (value= "fail" , required= false , defaultValue= "0") int fail,Model model) throws Exception{
		
		model.addAttribute("fail",fail);
		return "/mlogin";
	}
	
	//�α��ε��۱���
	@RequestMapping("/login.do")
	public String loginDo(@RequestParam Map<String, Object> param, HttpSession session) throws Exception{
		
		return service.loginCheck(param, session);
		
	}
	
	//�۾��� �������� �̵�
	@RequestMapping("/boardWrite")
	public String boardWrite() throws Exception{
		return "/boardWrite";
	}
	
	//�ӽ�������Ʈ�ѷ�
	@RequestMapping("/tempStore")
	public String tempStroe(BoardVO vo) throws Exception{
		System.out.println(vo);
		Bservice.boardInsert(vo);
		
		return "redirect:/";
	}
}
