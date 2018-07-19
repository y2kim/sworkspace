package kh.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesServices;


@Controller
public class IndexController {
//자동으로 추가 됨 
	
	@Autowired
	private MessagesServices service;
	
	@RequestMapping("/index.do")
	public String toIndex() {
		//string <- 스프링이 해석함 
		return "redirect:index.jsp";
	}
// 어제와 달라진건 핸들러 맵퍼가 없어짐  대신 리퀘스트 맵핑이 생김  이제 나머지는 지우면 되겠으나 아까우니 냅둠 
	@RequestMapping("/input.do")
	public String toInput() {
		return "redirect:input.jsp";
	}
	
	
//	@RequestMapping("/inputProc.do")
//	public ModelAndView toInputProc(HttpServletRequest req, HttpServletResponse res) {
	// session 필요 하면 session 추가  HttpSession
//		ModelAndView mav = new ModelAndView();
//		String writer = req.getParameter("writer");
//		String contents = req.getParameter("contents");
//		System.out.println(writer + " : " + contents);
//		 fuck...
//		int result = service.insertMessages(new MessagesDTO(0, writer, contents));
//		mav.addObject("result",result);
//		mav.setViewName("inputProcView.jsp");
//		return mav;
//	}

	
	@RequestMapping("/inputProc.do")
	public ModelAndView toInputProc(String hidden , MessagesDTO dto ) {
		
		// DTO 값에 들어 있지 않는 값을 받을때는  @RequestParam 이용해 값을 받는다     // @ModelAttribute
		// @RequestParam  안 붙여도 이름이 같다면 출력이 된다 
		System.out.println(hidden);
		int result = service.insertMessages(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		mav.setViewName("inputProcView.jsp");
		return mav;
	}
	
	@RequestMapping("/output.do")
		public ModelAndView toOutput(){
		ModelAndView mav = new ModelAndView();
		List<MessagesDTO> list = service.selectMessages();
		mav.addObject("list", list);
		mav.setViewName("output.jsp");
		return mav;
	}
	
	@RequestMapping("/delete.do")
	public String toDelete()  {
		return "redirect:delete.jsp";
	}
	
	@RequestMapping("/deleteProc.do")
	public ModelAndView toDeltePtoc(int seq) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		int result = service.deleteMessages(seq);
		mav.addObject("result",result);
		mav.setViewName("deleteProcView.jsp");
		return mav;
	}
	
	@RequestMapping("/update.do")
	public String toUpdate() throws Exception {
		return "redirect:modify.jsp";
	}
	
	@RequestMapping("/updateProc.do")
	public ModelAndView toUpdateProc(MessagesDTO dto) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		int result = service.modifyMessages(dto);
		mav.addObject("result",result);
		mav.setViewName("modifyProcView.jsp");
		return mav;
	}
}
