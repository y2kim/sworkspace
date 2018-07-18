package kh.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kh.spring.dto.MessgesDTO;
import kh.spring.interfaces.MessagesDAO;

@Component
public class MessagesDAOImpl implements MessagesDAO {
	
	@Autowired
	// 자동연결  
	private JdbcTemplate templete;
	
	@Override
	public int insert(MessgesDTO dto) {
		String sql = "insert into messages values(messages_seq.nextval,?,?)";
		return templete.update(sql,dto.getWriter(),dto.getContents());
		// 서비스에 사용할려고 
	}

}
