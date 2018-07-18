package kh.spring.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Temp {
	
	@Autowired  // 추가 가능 (많이 쓰임 ) 자동 연결  dependunce injection
	//의존성 주입 
	@Qualifier("productVO2") // Bean 같은 애들이 겹칠 경우  지정해줄수 있다 
	//자료형으로  기준으로  잡아준다   
	private ProductVO vo;
	
	public void print() {
		System.out.println(vo);
	}
}
