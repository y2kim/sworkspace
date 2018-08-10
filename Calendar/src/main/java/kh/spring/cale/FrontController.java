package kh.spring.cale;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kh.spring.jsonbeans.Listcall;


@Controller
public class FrontController {
	
	
	@RequestMapping(value = "/cals.do", method = RequestMethod.GET)
	@ResponseBody
	public  Map<String , Object> doC(@RequestParam("val") String val) {
		System.out.println(val);
		String value = val;
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		jsonObject.put("data", value);
		return jsonObject; 
	}
	
/*	@RequestMapping(value = "/listrecall.do" , method = RequestMethod.POST )
	public @ResponseBody ModelAndView ieste( @RequestParam("val") String id, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		System.out.println(id);
		System.out.println(response);
		ObjectMapper mapper = new ObjectMapper();
		Listcall value = mapper.readValue(new File("select.json"), Listcall.class);
		mapper.writeValue(new File("select.json"), Listcall.class);
		 mav.addObject("response",mapper);
		return mav;
	}*/
	
	
	@RequestMapping(value = "/listcall.do", method = RequestMethod.GET)
public @ResponseBody void home( @RequestParam("val") String id, HttpServletRequest request , HttpServletResponse response) throws JsonIOException, IOException {
	JSONArray jarray = new JSONArray();
	String valuebulid = id;
	response.setCharacterEncoding("utf8");
	response.setContentType("application/json");
	System.out.println(valuebulid);
	Map<String, String> resultMap = new HashMap<>();
	if(valuebulid.equals("apartments")) {
		JSONObject json = new JSONObject();
		json.put("vale",valuebulid);
		jarray.add(json);
	}else if(valuebulid.equals("houses")) {
		JSONObject json = new JSONObject();
		json.put("vale",valuebulid);
		jarray.add(json);
	}else if(valuebulid.equals("secondary_units")) {
		JSONObject json = new JSONObject();
		json.put("vale",valuebulid);
		jarray.add(json);
	}else if(valuebulid.equals("unique_homes")) {
		JSONObject json = new JSONObject();
		json.put("vale",valuebulid);
		jarray.add(json);
	}else if(valuebulid.equals("bnb")) {
		JSONObject json = new JSONObject();
		json.put("vale",valuebulid);
		jarray.add(json);
	}else if(valuebulid.equals("boutique_hotels_and_more")) {
		JSONObject json = new JSONObject();
		json.put("vale",valuebulid);
		jarray.add(json);
	}
	System.out.println(jarray);
	
	new Gson().toJson(jarray, response.getWriter());

}
	
}
