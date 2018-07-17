package kh.spring.exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.spring.controller.TVController;
//import kh.spring.factory.TvFactory;
import kh.spring.interfaces.Tv;
import kh.spring.tv.SamsungTV;

public class Main {
	public static void main(String[] args) {
		//cmd   main.java   ~~
//		Tv instance = TvFactory.getInstance(args[0]);// 팩토리 패턴 : 한계가 있다
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("applicationContext.xml");
		//context 환경이 new를 한다  우리가 하는것이 아니다!
		Tv instance = (Tv)ctx.getBean("tv");  // dependunce lookup 방식   dl 
		
		// 코드의 변화 없이 변하는  값이 출력 (유지보수) ~[디자인 패턴  비슷] 
		//new LgTv()
		TVController ct = new TVController(instance);
		//외부변화에 인해서   변화는 줄임     
		// 의존성을 바깥으로  넘김  결국  ->   아예 프로그램 바깥으로 전하자  씨부럴      
		// 팩토리 패턴 
		// 기능추가는 예외
		ct.test();
		
		
//		Tv instance2 = (Tv)ctx.getBean("tv"); 
//		TVController ct2 = new TVController(instance2);
//		ct2.test();
		
//		Tv instance3 = (Tv)ctx.getBean("tv"); 
//		TVController ct3 = new TVController(instance3);
//		ct3.test();
		
		
		ctx.close();
		//의존선 문제만 해결한 코드  
	}
}
