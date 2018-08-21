package kh.spring.cale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HostingController {
	
	@Autowired
	
	@RequestMapping("/first.host")
	public String toFirst() {
		//string <- 스프링이 해석함 
		return "hostFirstpage.jsp";
	}
	
	@RequestMapping("/second.host")
	public String toSecond() {
		//string <- 스프링이 해석함 
		return "hostSecondpage.jsp";
	}
	
	@RequestMapping("/third.host")
	public String toThird() {
		//string <- 스프링이 해석함 
		return "hostThirdpage.jsp";
	}
	
	@RequestMapping("/fore.host")
	public String toForth() {
		//string <- 스프링이 해석함 
		return "hostForthpage.jsp";
	}
	
	@RequestMapping("/five.host")
	public String toFive() {
		//string <- 스프링이 해석함 
		return "hostFivepage.jsp";
	}
	
	@RequestMapping("/step2first.host")
	public String Step2First() {
		//string <- 스프링이 해석함 
		return "step2HostFirstpage.jsp";
	}
	
	@RequestMapping("/step2second.host")
	public String Step2Second() {
		//string <- 스프링이 해석함 
		return "step2HostSecondpage.jsp";
	}
	
	@RequestMapping("/step2third.host")
	public String Step2Third() {
		//string <- 스프링이 해석함 
		return "step2HostThirdpage.jsp";
	}
	
	
}
