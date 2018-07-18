package kh.spring.main;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.spring.vo.ProductVO;
import kh.spring.vo.Temp;

public class Main {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		Temp instance = (Temp)ctx.getBean("temp");
		// @component 선언시 기본으로 첫글자에서 소분자로 바꾸면 된다     () 선언시 () 명으로
		instance.print();
		
		// 자바방식으로는 못 알아먹는다 
		Temp inst = new Temp();
		inst.print();
		
		//int list1 = instance.getPid();
		//String list2 = instance.getPname();
		
		//System.out.println(list1 + " : " + list2);
		
	}
}
