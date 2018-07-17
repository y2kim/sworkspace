package kh.spring.controller;

import kh.spring.interfaces.Tv;
import kh.spring.tv.LgTV;
import kh.spring.tv.SamsungTV;

public class TVController {
	//private SamsungTV tv;  <- 안해도 됨    다형성 적용하면 
	//다형성 성립
	private Tv tv;
	// 결합도 문제 !  -- 갑자기  바뀌거나  APi 변경시 이런경우 ...   [다형성 으로 해결 ]
	// 이로인해 결합도는 떨어짐 
	public TVController(Tv tv) {
		//this.tv = new SamsungTV();
		this.tv = tv;
		// new 때문에  결합도가 증가함  
		// 안쪽에서  어째든  결합도가 떨어줌  
	}
	
	public void test() {
//		this.tv.volumeUP();
//		this.tv.volumnDown();
//		this.tv.PowerDown();
//		this.tv.powerStart();
		System.out.println(tv);
		System.out.println(((SamsungTV)tv).getPrice());
		this.tv.powerOn();
		this.tv.powerOff();
		this.tv.volumeUp();
		this.tv.volumeDown();
	}
	
}
