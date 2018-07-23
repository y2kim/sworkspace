package kh.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import kh.security.util.EncrpyUtils;
import kh.spring.dto.MessagesDTO;

@Aspect
@Component
public class TestAspect {
	//한꺼번에 여러개가 아니여도  중간에  하나라도 낄때라고  사용할때라고 있으면 사용한다 
	
	// 메소드 리턴 타입  메소드 경로  매개 변수
	@Pointcut("execution(* kh.spring.impl.*SevicesImpl.get*(..))")
	public void getPointCut() {}
	//포인트 컷의 이름이 된다 위의 메소드가  
	//..(모든상황) (*)(어떤거 1개) (*,*)(2개) (int)  getAllDate()[]
	
	@Pointcut("execution(* kh.spring.impl.*SevicesImpl.insertMessages(..))")
	public void getInsertPointCut() {}
	
	@Before("getPointCut()")
	public void printHello() {
		// 정보 이전에 들어옴 
		System.out.println("hello");
	}
	
//	@Before("getInsertPointCut()")
//	public void printHelloView(JoinPoint jp) {
//		//JoinPoint
//		MessagesDTO dto = (MessagesDTO)jp.getArgs()[0];
//		System.out.println(dto.getWriter() + "님이" + dto.getContents() +" 라고 글을 작성했습니다");
//		System.out.println(System.currentTimeMillis() +"insert가 실행되었습니다 log");
//	}
	
	@Before("getInsertPointCut()")
	public void printHelloView(JoinPoint jp) {
		//JoinPoint
		MessagesDTO dto = (MessagesDTO)jp.getArgs()[0];
		dto.setContents(EncrpyUtils.getSha256(dto.getContents()));
	}
	
	
	
}
