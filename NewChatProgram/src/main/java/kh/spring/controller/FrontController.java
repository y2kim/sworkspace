package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.socket.Broadsocket;

@Controller
public class FrontController {


	
	@RequestMapping("/chat.do")
	public ModelAndView toIndex(HttpServletRequest req) {
		String names = req.getParameter("names");
		ModelAndView mav = new ModelAndView();
		mav.addObject("names",names);
		mav.setViewName("chat.jsp");
		return mav;
	}
	
}
