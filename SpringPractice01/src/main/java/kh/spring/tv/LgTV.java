package kh.spring.tv;

import kh.spring.interfaces.Tv;

public class LgTV implements Tv {
	// impliement 로 인해 귶칙을 지켜야 함	, 설계와 통제 목적 
//	public void powerStart(){
//		System.out.println("LG TV : 전원을 켭니다");
//	}
//	
//	public void volumeUP() {
//		System.out.println("LG TV : 볼륨을 높입니다");
//	}
//	
//	public void PowerDown() {
//		System.out.println("LG TV : 전원을 끕니다");
//	}
//	
//	public void volumnDown() {
//		System.out.println("LG TV : 볼륨을 낮춥니다");
//	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LG TV : 전원을 켭니다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LG TV : 전원을 끕니다");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LG TV : 볼륨을 높입니다");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LG TV : 볼륨을 낮춥니다");
	}
	
}
