package kh.spring.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("abc")

//()<-  안에 이름을 지으면 이름을 바꿀수 있다
public class ProductVO {
	
	
	private int Pid; //1001
	
	private String Pname; // Shampoo
	
	public ProductVO() {
		super();
	}
	public ProductVO(int pid, String pname) {
		Pid = pid;
		Pname = pname;
	}
	
	@Override
	public String toString() {
		
		return Pid + " : " + Pname ;
	}
	
	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	

	
}
