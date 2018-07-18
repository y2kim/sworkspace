package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kh.spring.dto.MessgesDTO;
import kh.spring.interfaces.MessagesService;

public class InputProcController implements Controller {

	@Autowired
	private MessagesService service;
	// 인터페이스 형 생성 
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String writer = req.getParameter("writer");
		String contents = req.getParameter("contents");
		
		System.out.println(writer + " : " + contents);
		int result = service.insert(new MessgesDTO(0, writer, contents));
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		mav.setViewName("inputProcView.jsp");
		return mav;
	}

}
