package kh.spring.jsonpractice;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;


@Controller
public class HomeController {
	

	@RequestMapping(value = "/listcall.do", method = RequestMethod.POST)
	public void home( @RequestParam("val") String id, HttpServletRequest request , HttpServletResponse response) throws JsonIOException, IOException {
		JsonArray jarray = new JsonArray();
		response.setCharacterEncoding("utf8");
		response.setContentType("application/json");
		System.out.println(id);
		System.out.println(request.getParameter("val"));
		JsonObject json = new JsonObject();
		json.addProperty(id, "dummy");
		jarray.add(json);
		new Gson().toJson(jarray, response.getWriter());

	}
	
}
