package kh.spring.exam;

import java.util.Map;

public class MapBean {
	
	private Map<String, String> maps;

	public MapBean() {
		super();
	}

	public MapBean(Map<String, String> maps) {
		super();
		this.maps = maps;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	
	
}
