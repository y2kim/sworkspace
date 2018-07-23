package kh.security.util;

import kh.spring.dto.MessagesDTO;

public class Test {
	
	public static void encrpyt(MessagesDTO dto) {
		//contents = EncrpyUtils.getSha256(contents);   <- Call By Value [기본 자료형 + String]
		// stack[] <-  여기서 암호화 해봤자야  여기 있는 것만 사라져서  소용이 없다 
		dto.setContents(EncrpyUtils.getSha256(dto.getContents()));
		/* 정확히 말하면 1000 번지 주소값을 가지고 있는것이다   1000번지 값을 꺼내서 암호화 시킨다 
		 * */
	}
	
	public static void main(String[] args) {
		//사실상 기본 자바 
		String contents = "Hello";
		MessagesDTO dto = new MessagesDTO();
		dto.setContents(contents);
		encrpyt(dto);
		/* 암호화 시킴   stack 메모리 구조를 기억   Call By Ref 방식 [그외  것들]   */
		System.out.println(dto.getContents());
		
	}
}
