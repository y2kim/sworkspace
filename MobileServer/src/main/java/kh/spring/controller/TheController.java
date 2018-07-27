package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesServices;

@Controller
public class TheController {
	
	@Autowired
	private MessagesServices service;
	
	
	@RequestMapping("index.do")
	public String toIndex() {
		return "redirect:index.jsp";
	}
	
	@RequestMapping("/input.do")
	public String toInput() {
		return "redirect:input.jsp";
	}
	
	
	@RequestMapping("inputProc.do")
	public ModelAndView toInputProc(MessagesDTO dto ) {
		
		int result =0 ;
		ModelAndView mav = new ModelAndView();
		try {
		 result = service.insertMessages(dto);	
		 mav.addObject("result",result);
		 mav.setViewName("index.jsp");
		}catch (Exception e) {
		e.printStackTrace();
		mav.setViewName("index.jsp");
		}
		return mav;
	}
	
	@RequestMapping("/output.do")
	public ModelAndView toOutput(){
	ModelAndView mav = new ModelAndView();
	
	List<MessagesDTO> list = service.getAllData();
	
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
