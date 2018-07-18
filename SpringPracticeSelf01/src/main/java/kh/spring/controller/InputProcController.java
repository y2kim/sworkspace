package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesServices;



public class InputProcController implements Controller {
	
	@Autowired
	private MessagesServices service;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		String writer = req.getParameter("writer");
		String contents = req.getParameter("contents");
		
		System.out.println(writer + " : " + contents);
		
		ModelAndView mav = new ModelAndView();
		int result = service.insertMessages(new MessagesDTO(0, writer, contents));
		mav.addObject("result",result);
		mav.setViewName("inputProcView.jsp");
		return mav;
	}

}
