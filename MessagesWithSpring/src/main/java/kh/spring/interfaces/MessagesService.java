package kh.spring.interfaces;

import java.util.List;

import kh.spring.dto.MessagesDTO;

public interface MessagesService {
	public int insert(MessagesDTO dto) throws Exception;
	public List<MessagesDTO> getAllData() throws Exception;
	public int delete(int seq) throws Exception;
	public int update(MessagesDTO dto , int seq) throws Exception;
}
