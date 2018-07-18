package kh.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.spring.dto.MessgesDTO;
import kh.spring.interfaces.MessagesDAO;
import kh.spring.interfaces.MessagesService;

@Component
public class MessagesServiceImpl implements MessagesService {
	// controll 
	@Autowired
	private MessagesDAO dao;
	// 다형성 
	
	@Override
	public int insert(MessgesDTO dto) {
		
		return dao.insert(dto);
	}

}
