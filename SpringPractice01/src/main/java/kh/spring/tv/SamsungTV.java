package kh.spring.tv;

import kh.spring.interfaces.Speaker;
import kh.spring.interfaces.Tv;


public class SamsungTV implements Tv  {
	// 상속 
	
	private int price;
	private Speaker speaker;
	
	public void init() {
		System.out.println("Samsung Tv init" );
	}
	
	public void destroy() {
		System.out.println("Samsung Tv Destroy" );
	}
	
	public SamsungTV() {}
	
	public SamsungTV(int price, Speaker speaker) {
		this.price = price;
		this.speaker = speaker;
	};
	
	
	public void powerOn() {
		System.out.println("Samsung TV : 전원을 켭니다");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV : 전원을 끕니다");
	}
	
	public void volumeUp() {
		this.speaker.volumeUp();
		//System.out.println("Samsung TV : 볼륨을 올립니다");
	}
	
	public void volumeDown() {
		this.speaker.volumeDown();
		//System.out.println("Samsung TV : 볼륨을 내립니다");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	
	
}
