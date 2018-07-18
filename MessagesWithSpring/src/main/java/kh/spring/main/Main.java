package kh.spring.main;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kh.messages.impl.MessagesServiceImpl;
import kh.spring.dto.MessagesDTO;

public class Main {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		MessagesServiceImpl ms = (MessagesServiceImpl)ctx.getBean("messagesServiceImpl");
		
		//List<MessagesDTO> list = ms.getAllData();
		
		int result = ms.insert(new MessagesDTO(0,"fly to the sky","gravity"));
		
		//ms.delete(4);
//		MessagesDTO msg = new MessagesDTO();
//		msg.setWriter("sin");
//		msg.setContents("cos");
//		int result = ms.update(msg,6);
//		System.out.println(result);
		
//		for(MessagesDTO tmp : list) {
//			System.out.println(tmp);
//		}
		
		
	}
}
