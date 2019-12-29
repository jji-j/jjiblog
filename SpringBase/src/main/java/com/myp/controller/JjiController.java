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
	

	@Inject   // 주입(심부름꾼) 명시
	private MemberService service; // Service 호출을 위한 객체생성
	
	@Inject
	private BoardService Bservice; // Service 호출을 위한 객체생성
	
	//목록페이지
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
			//자바스크립트로 로그인필요일 때 alert창 띄우기 위함
			model.addAttribute("id", "로그인필요");
		}
		
		return "/listAll";
	}
	
	//회원가입페이지
	@RequestMapping("/memberRegist")
	public String mRegist() throws Exception{
		
		return "/memberRegist";
	}

	@RequestMapping(value ="/memberRegist.do", method = RequestMethod.GET)//회원가입동작구현
	public String mbRegistDo(@RequestParam Map<String, Object> param) throws Exception{
		System.out.println(param);
		service.create(param);
		return "redirect:/";
	}
	
	//로그인페이지
	@RequestMapping("/mLogin")
	public String mLogin(@RequestParam (value= "fail" , required= false , defaultValue= "0") int fail,Model model) throws Exception{
		
		model.addAttribute("fail",fail);
		return "/mlogin";
	}
	
	//로그인동작구현
	@RequestMapping("/login.do")
	public String loginDo(@RequestParam Map<String, Object> param, HttpSession session) throws Exception{
		
		return service.loginCheck(param, session);
		
	}
	
	//글쓰기 페이지로 이동
	@RequestMapping("/boardWrite")
	public String boardWrite() throws Exception{
		return "/boardWrite";
	}
	
	//임시저장컨트롤러
	@RequestMapping("/tempStore")
	public String tempStroe(BoardVO vo) throws Exception{
		System.out.println(vo);
		Bservice.boardInsert(vo);
		
		return "redirect:/";
	}
}
