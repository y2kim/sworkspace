package kh.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesServices;

public class OutputController implements Controller {

	@Autowired
	private MessagesServices service;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		List<MessagesDTO> list = service.selectMessages();
		mav.addObject("list", list);
		mav.setViewName("output.jsp");
		return mav;
	}

}
