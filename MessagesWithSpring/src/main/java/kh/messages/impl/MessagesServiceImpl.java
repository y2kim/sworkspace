package kh.messages.impl;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesDAO;
import kh.spring.interfaces.MessagesService;

@Service
public class MessagesServiceImpl implements MessagesService {
	
	@Autowired
	private MessagesDAO dao;
	
//	@Autowired
//	private DataSource ds;
// JdbcTemplate 로 인해 필요 없어짐ㅂ 	

	@Override
	public List<MessagesDTO> getAllData() throws Exception {
		//Connection con = ds.getConnection();
		List<MessagesDTO> result = null;
		try {
			//result = this.dao.getAllData(con);
			result = this.dao.getAllData();
		} finally {
		//	con.close();
		}
		
		return result;
		//return dao.getAllData();
	}

	@Override
	public int insert(MessagesDTO dto) throws Exception {
		int result = 0;
		try {
			result = this.dao.insert(dto);
		} catch (Exception e) {
			
		}finally {
			
		}
			
		return result;
	}

	@Override
	public int delete(int seq) throws Exception {
		
		return 0;
	}

	@Override
	public int update(MessagesDTO dto , int seq) throws Exception {

		
		return 0;
	}
	
	
	
	
}
