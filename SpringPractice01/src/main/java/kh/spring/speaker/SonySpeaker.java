package kh.spring.speaker;

import kh.spring.interfaces.Speaker;

public class SonySpeaker implements Speaker {
	
	public void volumeUp() {
		System.out.println("Sony Speaker: 볼륨을 높입니다.");
	}
	
	public void volumeDown() {
		System.out.println("Sony Speaker: 볼륨을 낮춥니다.");
	}
	
}
