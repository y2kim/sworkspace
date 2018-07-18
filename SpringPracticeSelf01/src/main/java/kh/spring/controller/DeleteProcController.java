package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kh.spring.interfaces.MessagesServices;

public class DeleteProcController implements Controller {

	@Autowired
	private MessagesServices service;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String seq_v = req.getParameter("seq");
		int seq = Integer.parseInt(seq_v);
		System.out.println(seq);
		ModelAndView mav = new ModelAndView();
		int result = service.deleteMessages(seq);
		mav.addObject("result",result);
		mav.setViewName("deleteProcView.jsp");
		return mav;
	}

}
