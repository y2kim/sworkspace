package kh.spring.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesDAO;
import kh.spring.interfaces.MessagesServices;

@Component
public class MessagesSevicesImpl implements MessagesServices {
	
	@Autowired
	private  MessagesDAO dao ;
	
	@Override
	@Transactional("txManager")
//	트랜잭션 아이디 확인 
	//2개이상 작업이 껴있는  경우 트랜잭션 사용 
	public int insertMessages(MessagesDTO dto) {
		System.out.println("insert 실행 완료");
		dto.setSeq(-1);
		return dao.insertMessages(dto);
	}

//	@Override
//	@Transactional
//	public List<MessagesDTO> selectMessages() {
//		
//		return dao.selectMessages();
//	}

	@Override
	@Transactional("txManager")
	public int deleteMessages(int seq) {

		return dao.deleteMessages(seq);
	}

	@Override
	@Transactional("txManager")
	public int modifyMessages(MessagesDTO dto) {

		return dao.modifyMessages(dto);
	}
	
	@Override
	@Transactional("txManager")
	public List<MessagesDTO> getAllData() {
		System.out.println("ABC");
		return dao.getAllData();
	}

}
