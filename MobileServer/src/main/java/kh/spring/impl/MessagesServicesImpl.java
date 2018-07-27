package kh.spring.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesDAO;
import kh.spring.interfaces.MessagesServices;

@Component
public class MessagesServicesImpl implements MessagesServices{

	@Autowired
	private MessagesDAO dao;
	
	@Override
	@Transactional("txManager")
	public int insertMessages(MessagesDTO dto) {
		
		return dao.insertMessages(dto);
	}

	@Override
	@Transactional("txManager")
	public int deleteMessages(int seq) {
		// TODO Auto-generated method stub
		return dao.deleteMessages(seq);
	}

	@Override
	@Transactional("txManager")
	public int modifyMessages(MessagesDTO dto) {
		// TODO Auto-generated method stub
		return dao.modifyMessages(dto);
	}

	@Override
	@Transactional("txManager")
	public List<MessagesDTO> getAllData() {
		// TODO Auto-generated method stub
		return dao.getAllData();
	}

}
