package kh.spring.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesDAO;
import kh.spring.interfaces.MessagesServices;

@Component
public class MessagesSevicesImpl implements MessagesServices {
	
	@Autowired
	private  MessagesDAO dao ;
	
	@Override
	public int insertMessages(MessagesDTO dto) {
		
		return dao.insertMessages(dto);
	}

	@Override
	public List<MessagesDTO> selectMessages() {
		
		return dao.selectMessages();
	}

	@Override
	public int deleteMessages(int seq) {

		return dao.deleteMessages(seq);
	}

	@Override
	public int modifyMessages(MessagesDTO dto) {

		return dao.modifyMessages(dto);
	}

}
