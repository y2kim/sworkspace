package kh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kh.spring.interfaces.MessagesService;

public class InputContoller implements Controller {
// controller 라는 것을 상속을 받아야 함 
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		// result = dao / insert();
		// mav . addObjest("result",result);
		mav.setViewName("redirect:input.jsp");
		//default  : forword   // redirect
		return mav;
	}
	
}
