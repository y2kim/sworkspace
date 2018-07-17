package kh.spring.exam;

import java.util.List;

public class ListBean {
	
	private List<String> list;
	
	
	
	public ListBean() {
	}
	public ListBean(List<String> list) {
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
}
