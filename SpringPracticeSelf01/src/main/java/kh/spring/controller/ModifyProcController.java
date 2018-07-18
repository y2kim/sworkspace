package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesServices;

public class ModifyProcController implements Controller {
	
	@Autowired
	private MessagesServices service;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String writer = req.getParameter("writer");
		String contents = req.getParameter("contents");
		String seq_v = req.getParameter("seq");
		int seq = Integer.parseInt(seq_v);
		
		System.out.println(writer + " : " + contents + " : " + seq);
		
		ModelAndView mav = new ModelAndView();
		int result = service.modifyMessages(new MessagesDTO(seq, writer, contents));
		mav.addObject("result",result);
		mav.setViewName("modifyProcView.jsp");
		return mav;
	}

}
