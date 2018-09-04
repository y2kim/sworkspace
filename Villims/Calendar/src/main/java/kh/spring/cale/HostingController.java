package kh.spring.cale;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.dto.HomeDTO;
import kh.spring.dto.HomeDescDTO;
import kh.spring.interfaces.HomeService;

@Controller
public class HostingController {

	@Autowired
	private HomeService service;

	@RequestMapping("/first.host")
	public String toFirst() {
		//string <- 스프링이 해석함 
		return "hostFirstpage.jsp";
	}

	@RequestMapping("/second.host")
	public String toSecond() {

		return "hostSecondpage.jsp";
	}


	@RequestMapping("/secondnext.host")
	public ModelAndView createAndnext(HomeDTO hdto,HttpSession session,HttpServletRequest req ,HttpServletResponse res) {
		System.out.println("생성");
		ModelAndView mav = new ModelAndView();
		int result = service.insertFirstHome(hdto);
		HomeDTO homedto = service.getNewestHomeData();
		int seq= homedto.getHome_seq();
		String email = homedto.getMember_email();
		System.out.println(seq);
		System.out.println(email);
		//		if(email==req.getSession().getAttribute("email").toString()){
		//			
		//		}else{
		//			email = "임시";
		//		}
		req.getSession().setAttribute("email", email);
		req.getSession().setAttribute("hostingseq", seq);
		mav.addObject("result",result);
		mav.setViewName("second.host");
		return mav;
	}

	@RequestMapping("/thirdMove.host")
	public ModelAndView toMoveThird(HomeDTO hdto,HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("home_type수정 과 세번째 페이지 이동");
		ModelAndView mav = new ModelAndView();
		String home_type = req.getParameter("room_type");
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		System.out.println(home_type);
		//		int result = service.insertMessages(new MessagesDTO(0, writer, contents));
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_type(home_type);
		int result = service.modifyHomeType(homedto);
		mav.addObject("result",result);
		mav.setViewName("third.host");
		return mav;
	}

	@RequestMapping("/third.host")
	public String toThird() {
		return "hostThirdpage.jsp";
	}



	@RequestMapping("/foreMove.host")
	public ModelAndView toMoveFore(HomeDTO hdto,HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("bed과bath수정동시 네번째 페이지 이동");
		ModelAndView mav = new ModelAndView();
		String people = req.getParameter("home_people");
		String bedroom = req.getParameter("home_bedroom");
		String bed = req.getParameter("home_bed");
		System.out.println(people + " : " + bedroom + " : " + bed);
		int peoplecount = Integer.parseInt(people.toString()+"");
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);

		//		int result = service.insertMessages(new MessagesDTO(0, writer, contents));
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_people(peoplecount);
		int result = service.modifyBathbed(homedto);
		//mav.addObject("result",result);
		mav.setViewName("fore.host");
		return mav;
	}

	@RequestMapping("/fore.host")
	public String toForth() {
		return "hostForthpage.jsp";
	}

	@RequestMapping("/pagegofive.host")
	public ModelAndView toMoveFive(HomeDTO hdto,HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("map 처리  5 페이지 이동");
		ModelAndView mav = new ModelAndView();
		String nation = req.getParameter("home_nation");
		String addr1 = req.getParameter("home_addr1");
		String addr2 = req.getParameter("home_addr2");
		String addr3 = req.getParameter("home_addr3");
		String addr4 = req.getParameter("home_addr4");
		String lat = req.getParameter("home_lat");
		String lng = req.getParameter("home_lng");
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);

		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_nation(nation);
		homedto.setHome_addr1(addr1);
		homedto.setHome_addr2(addr2);
		homedto.setHome_addr3(addr3);
		homedto.setHome_addr4(addr4);
		homedto.setHome_lat(lat);
		homedto.setHome_lng(lng);
		int result = service.modifyHomeLocData(homedto);
		mav.addObject("result",result);
		mav.setViewName("five.host");
		return mav;
	}

	@RequestMapping("/five.host")
	public String toFive() {
		return "hostFivepage.jsp";
	}

	//steponeover.host
	@RequestMapping("/steponeover.host")
	public ModelAndView stepOneOver(@RequestParam(value="home_amenities", required=false) List<String>home_amenities,@RequestParam(value="home_safety", required=false) List<String>home_safety,
			HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("편의시설,안전시설 수정  스텝1 끝 스텝2 이동준비");
		ModelAndView mav = new ModelAndView();
		List<String> amenities = home_amenities;
		List<String> safety = home_safety;
		System.out.println(amenities +":" +safety);
		//List<String> test1 = req.getParameter("check");
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		String amenitiesList ="";
		String safetyList ="";
		try {
			for(int i=0;i<amenities.size();i++){
				if(i<amenities.size()-1){
					amenitiesList += amenities.get(i)+",";
				}else{
					amenitiesList += amenities.get(i);
				}
			}

		} catch (Exception e) {
			amenitiesList = "없음";
		}

		try {
			for(int i=0;i<safety.size();i++){
				if(i<safety.size()-1){
					safetyList += safety.get(i)+",";
				}else{
					safetyList += safety.get(i);
				}
			}	
		} catch (Exception e) {
			safetyList = "없음";
		}

		System.out.println(amenitiesList + ":" +safetyList );
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_amenities(amenitiesList);
		homedto.setHome_safety(safetyList);	

		int result = service.modifyCommodity(homedto);
		mav.addObject("result",result);
		mav.setViewName("step2first.host");
		return mav;
	}

	@RequestMapping("/step2first.host")
	public String Step2First() {
		return "step2HostFirstpage.jsp";
	}

	@RequestMapping("/gostep2second.host")
	public ModelAndView Step2SecondMove(@RequestParam(value="home_main_pic", required=true) List<String> home_main_pic ,HomeDTO hdto
			,HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("picture 수정 추가 ");
		ModelAndView mav = new ModelAndView();
		List<String> mainpic = home_main_pic;
		System.out.println(mainpic);
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		String mainpicList ="";
		for(int i=1;i<mainpic.size();i++){
			if(i<mainpic.size()-1){
				mainpicList += mainpic.get(i)+",";
			}else{
				mainpicList += mainpic.get(i);
			}
		}
		System.out.println(mainpicList);
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_main_pic(mainpicList);
		int result = service.modifyHomepicture(homedto);
		mav.addObject("result",result);
		mav.setViewName("step2second.host");
		return mav;
	}


	@RequestMapping("/step2second.host")
	public String Step2Second() {
		//string <- 스프링이 해석함 
		return "step2HostSecondpage.jsp";
	}

	@RequestMapping("/gostep2third.host")
	public ModelAndView Step2ThirdMove(HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("잡다 설명 추가  수정 추가 ");
		ModelAndView mav = new ModelAndView();
		String contents = req.getParameter("home_contents");
		String explain = "";
		String space = ""; 
		String guest = "";
		String etc = ""; 
		String region = "";
		String traffic = ""; 
		try {
			explain = req.getParameter("home_desc_explain");
			space = req.getParameter("home_desc_space");
			guest = req.getParameter("home_desc_guest");
			etc = req.getParameter("home_desc_etc");
			region = req.getParameter("home_desc_region");
			traffic = req.getParameter("home_desc_traffic");
		} catch (Exception e) {
			explain = "null";
			space = "null";
			guest = "null";
			etc = "null";
			region = "null";
			traffic = "null";
		}
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		System.out.println(contents + explain + space + guest + etc + region + traffic);
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_contents(contents);
		HomeDescDTO hddto = new HomeDescDTO();
		hddto.setHome_Seq(seq);
		hddto.setHome_desc_explain(explain);
		hddto.setHome_desc_space(space);
		hddto.setHome_desc_guest(guest);
		hddto.setHome_desc_etc(etc);
		hddto.setHome_desc_region(region);
		hddto.setHome_desc_traffic(traffic);
		int result = service.modifyContents(homedto);
		try {
			int result2 = service.insertHomeDescData(hddto);
		}catch (Exception e) {
			System.out.println("부가셜명 없음 ");
		}
		mav.addObject("result",result);
		//mav.addObject("result2",result2);
		mav.setViewName("step2HostThirdpage.jsp");
		return mav;
	}


	@RequestMapping("/step2third.host")
	public String Step2Third() {
		//string <- 스프링이 해석함 
		return "step2HostThirdpage.jsp";
	}

	@RequestMapping("/step2over.host")
	public ModelAndView Step2over(HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("이름  수정 스텝2 종료  ");
		ModelAndView mav = new ModelAndView();

		String homename = req.getParameter("home_name");
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_name(homename);
		int result = service.modifyHomename(homedto);
		mav.addObject("result",result);
		mav.setViewName("step3first.host");
		return mav;
	}


	@RequestMapping("/step3first.host")
	public String Step3First() {
		//string <- 스프링이 해석함 
		return "step3HostFirstpage.jsp";
	}

	@RequestMapping("/gostep3second.host")
	public ModelAndView Step3SecondMove(@RequestParam(value="home_guest_access", required=false) List<String>home_guest_access,@RequestParam(value="home_rules", required=false) List<String>home_rules,
			@RequestParam(value="addon", required=false) List<String>addon,HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("이름  수정 스텝3 페이지2 이동  ");
		ModelAndView mav = new ModelAndView();
		List<String> homeguestaccess = home_guest_access;
		List<String> homerules = home_rules;
		List<String> addons = addon;
		String homename = req.getParameter("home_name");
		//int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		//System.out.println(seq);
		String guestaccessList ="";
		String rulesList ="";
		try {
			for(int i=0;i<homeguestaccess.size();i++){
				if(i<homeguestaccess.size()-1){
					guestaccessList += homeguestaccess.get(i)+",";
				}else{
					guestaccessList += homeguestaccess.get(i);
				}
			}

		} catch (Exception e) {
			guestaccessList = null;
		}

		try {
			for(int i=0;i<homerules.size();i++){
				//for(int j=0;j<addons.size();j++){
					
					if(i<homerules.size()-1){
						rulesList += homerules.get(i) +" : ";
						rulesList += addons.get(i)+",";
					}else{
						rulesList += homerules.get(i) +" : ";
						rulesList += addons.get(i);
					}
				//}
			}	
		} catch (Exception e) {
			rulesList = null;
		}
		HomeDTO homedto = new HomeDTO();
		//homedto.setHome_seq(seq);
		System.out.println(guestaccessList+":"+rulesList);
		//int result = service.modifyHomename(homedto);
		//mav.addObject("result",result);
		mav.setViewName("step3second.host");
		return mav;
	}


	@RequestMapping("/step3second.host")
	public String Step3Second() {
		//string <- 스프링이 해석함 
		return "step3HostSecondpage.jsp";
	}

	@RequestMapping("/gostep3third.host")
	public ModelAndView Step3ThirdMove(HttpSession session,HttpServletRequest req,HttpServletResponse res) {

		ModelAndView mav = new ModelAndView();
		String checkinend = req.getParameter("home_checkin_end");
		System.out.println(checkinend);
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_checkin_end(checkinend);
		int result = service.modifyHomecheck(homedto);
		mav.addObject("result",result);
		mav.setViewName("step3third.host");
		return mav;
	}

	@RequestMapping("/step3third.host")
	public String Step3Third() {
		//string <- 스프링이 해석함 
		return "step3HostThirdpage.jsp";
	}

	@RequestMapping("/gostep3fore.host")
	public ModelAndView Step3ForeMove(HttpSession session,HttpServletRequest req,HttpServletResponse res) {

		ModelAndView mav = new ModelAndView();
		int home_min_stay = Integer.parseInt(req.getParameter("home_min_stay").toString());
		int home_max_stay = Integer.parseInt(req.getParameter("home_max_stay").toString());
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_min_stay(home_min_stay);
		homedto.setHome_max_stay(home_max_stay);
		int result = service.modifyHomestay(homedto);
		mav.addObject("result",result);
		mav.setViewName("step3fore.host");
		return mav;
	}

	@RequestMapping("/step3fore.host")
	public String Step3Forth() {
		//string <- 스프링이 해석함 
		return "step3HostFour.jsp";
	}

	@RequestMapping("/gostep3five.host")
	public ModelAndView Step3FiveMove(HttpSession session,HttpServletRequest req,HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView();
		String homeblockeddate=req.getParameter("home_blocked_date");
		System.out.println("!!!!!!");
		System.out.println(homeblockeddate);
		List<String> blockeddate = new ArrayList<>();
		String[] splited = homeblockeddate.split("\\,");
		System.out.println(splited.length);
		String blockeddateList ="";
		for(int i=0;i<splited.length;i++){
			blockeddate.add(i, splited[i]);
		}
		for(int i=0;i<blockeddate.size();i++){
			if(i<blockeddate.size()-1){
				blockeddateList += blockeddate.get(i)+",";
			}else{
				blockeddateList += blockeddate.get(i);
			}
		}
		System.out.println(blockeddateList);
		HomeDTO homedto = new HomeDTO();
		//homedto.setHome_seq(seq);

		//int result = service.modifyHomeblock(homedto);
		//mav.addObject("result",result);
		mav.setViewName("step3five.host");
		return mav;
	}

	@RequestMapping("/step3five.host")
	public String Step3Five() {
		//string <- 스프링이 해석함 
		return "step3HostFivepage.jsp";
	}

	@RequestMapping("/step3final.host")
	public ModelAndView Step3Final(HttpSession session,HttpServletRequest req,HttpServletResponse res) {

		ModelAndView mav = new ModelAndView();
		int homeprice = Integer.parseInt(req.getParameter("home_price").toString());
		System.out.println(homeprice);
		int seq = Integer.parseInt(req.getSession().getAttribute("hostingseq").toString());
		System.out.println(seq);
		HomeDTO homedto = new HomeDTO();
		homedto.setHome_seq(seq);
		homedto.setHome_price(homeprice);
		int result = service.modifyHomeprice(homedto);
		mav.addObject("result",result);
		System.out.println("도르마무도르마무");
		mav.setViewName("first.host");
		return mav;
	}

	@RequestMapping("/check.check")
	public ModelAndView checkcheck(@RequestParam(value="check", required=true) List<String>values,  HttpSession session,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("!!!");
		List<String> test1 = values;
		//List<String> test1 = req.getParameter("check");
		String test2 = req.getParameter("box");
		System.out.println(test1 + ":" + test2);
		ModelAndView mav = new ModelAndView();
		//mav.addObject("result",result);
		mav.setViewName("five.host");
		return mav;
	}


}
