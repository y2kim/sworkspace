package kh.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
	
//	@Before("getInsertPointCut()")
//	public void printHelloView(JoinPoint jp) {
//		//성공적인 암호화  기본설정 
//		MessagesDTO dto = (MessagesDTO)jp.getArgs()[0];
//		dto.setContents(EncrpyUtils.getSha256(dto.getContents()));
//		// 주소값이 같아서  값이 변함   call by value  ,ref 문제 
//		// 컨트롤러에서 DTO 일경우에만 됨 
//		// 리턴하는건 의미가 없다는 문제가 있음     주소를  지워버리기 때문에   Call by ref 관련 이야기 
//		//  횡단 관심사라는 것을 기억을 해야함  ARound 
//	}
	
//	@Before("getInsertPointCut()")
//	public void printHelloView(JoinPoint jp) {
//		//JoinPoinㅅ
//		String contents = jp.getArgs()[1].toString();
//		//오버헤드만 일어남 
	//  이지역에서 사라져 버린다
//		contents = EncrpyUtils.getSha256(contents);
//	}

	@Around("getInsertPointCut()")
	public int printHelloView(ProceedingJoinPoint pjp) {
		// Around 방식
		MessagesDTO dto = (MessagesDTO) pjp.getArgs()[0];
		
		// 현재 cbv 
		dto.setContents(EncrpyUtils.getSha256(dto.getContents())); 
		int result = 0;
		// 서비스 이전 
		try {
			result =  (Integer) pjp.proceed(new Object[] {dto});
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// 기준으로  위로는 Before  밑으로는 after /  타이밍을 정할수 있음 / 결과을  끼어넣을수 있음 / return은 안됨 
		// 변조 가능   오브젝트로 돌려 보넴    /cbv cbr  관련없음 
		
		return result;
		// 컨트롤러에 넘어간다 
		//Around 특징 :  대상 타켓 리턴 타입과 동일해야함  // 관여영역  
	}
	
//	@Around("getInsertPointCut()")
//	public Boolean printHelloView(ProceedingJoinPoint pjp) {
//		// Around 방식  String 방식으로 넘길때  
//		String id = pjp.getArgs()[0].toString();
//		String pw = pjp.getArgs()[1].toString();
//		// 현재 cbv 
//		pw = EncrpyUtils.getSha256(pw);
//		Boolean result = false;
//		// 서비스 이전 
//		try {
//			result = (Boolean) pjp.proceed(new Object[] {id,pw});
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		// 기준으로  위로는 Before  밑으로는 after /  타이밍을 정할수 있음 / 결과을  끼어넣을수 있음 / return은 안됨 
//		// 변조 가능   오브젝트로 돌려 보넴    /cbv cbr  관련없음 
//		
//		return result;
//		// 컨트롤러에 넘어간다 
//		//Around 특징 :  대상 타켓 리턴 타입과 동일해야함  // 관여영역  
//	}
}
