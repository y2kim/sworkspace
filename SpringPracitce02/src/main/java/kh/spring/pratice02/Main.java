package kh.spring.pratice02;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.spring.exam.ListBean;
import kh.spring.exam.MapBean;
import kh.spring.exam.QuizBean;
import kh.spring.exam.SetBean;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		ListBean instance = (ListBean)ctx.getBean("listBean");
		
		List<String> list = instance.getList();
		
		for(String tmp:list) {
			System.out.println(tmp);
		}
		
		System.out.println("-------------------------------------------");
		
		
		SetBean instance2 = (SetBean)ctx.getBean("setBean");
		Set<String> set = instance2.getSet();
		for(String tmp: set) {
			System.out.println(tmp);
		}
		
		System.out.println("-------------------------------------------");
		
		
		
		MapBean instance3 = (MapBean)ctx.getBean("mapBean");
		Map<String,String> map = instance3.getMaps();
		for(String tmp: map.keySet()) {
			System.out.println(tmp + " : " + map.get(tmp));
		}
		
		System.out.println("-------------------------------------------");
		
		QuizBean instance4 = (QuizBean)ctx.getBean("quizBean");
		int interal = instance4.getLiteral();
		Map<String,String> quizmap = instance4.getMap();
		List<String> quizlist = instance4.getNameList();
		
		System.out.println(interal);
		
		for(String tmp: quizmap.keySet()) {
			System.out.println(tmp + " : " + quizmap.get(tmp));
		}
		for(String tmp:quizlist) {
			System.out.println(tmp);
		}
		ctx.close();	
	}
}
