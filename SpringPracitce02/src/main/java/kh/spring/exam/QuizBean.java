package kh.spring.exam;

import java.util.List;
import java.util.Map;

public class QuizBean {
	private int literal;
	private Map<String, String> map;
	private List<String> nameList;
	
	
	public QuizBean() {
		super();
	}

	public QuizBean(int literal, Map<String, String> map, List<String> nameList) {
		super();
		this.literal = literal;
		this.map = map;
		this.nameList = nameList;
	}
	
	public int getLiteral() {
		return literal;
	}
	public void setLiteral(int literal) {
		this.literal = literal;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	
	
	
}
