package board.ajjini.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JjiController {
	
	@RequestMapping("/ajax")
	public String ajax() throws Exception {
		return "/ajjini/ajaxTest";
	}
	
	@RequestMapping("/ajax.ajax")
	@ResponseBody
	public Map<String, Object> ajaxAjax() throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("oo", "jjini");
		
		return map;
	}
	
}
