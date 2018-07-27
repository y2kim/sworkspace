package kh.spring.interfaces;

import java.util.List;

import kh.spring.dto.MessagesDTO;

public interface MessagesDAO {
	public int insertMessages(MessagesDTO dto);
	public int deleteMessages(int seq);
	public int modifyMessages(MessagesDTO dto);
	public List<MessagesDTO> getAllData();
}
