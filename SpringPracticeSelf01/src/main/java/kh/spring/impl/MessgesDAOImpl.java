package kh.spring.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesDAO;

@Component
public class MessgesDAOImpl implements MessagesDAO {
	
	@Autowired
	//private JdbcTemplate template;	
	private SqlSessionTemplate template;

	@Override
	public int insertMessages(MessagesDTO dto) {
		
		return template.insert("Messages.insert",dto);
	}

	@Override
	public int deleteMessages(int seq) {
		
		return template.delete("Messages.delete",seq);
	}

	@Override
	public int modifyMessages(MessagesDTO dto) {
		
		return template.update("Messages.update", dto);
	}

	@Override
	public List<MessagesDTO> getAllData() {
		// TODO Auto-generated method stub
		return template.selectList("Messages.selectAll");
	}
	
/*	
	@Override
	public int insertMessages(MessagesDTO dto) {
		String sql = "insert into messages values(messages_seq.nextval,?,?)";
//		if(dto.getSeq() == -1) {
//			return template.update(sql, dto.getWriter(),dto.getContents());
//		}
		return template.update(sql, dto.getWriter(),dto.getContents());
	}

//	@Override
//	public List<MessagesDTO> selectMessages() {
//		String sql = "select * from messages";
//		return template.query(sql, new RowMapper<MessagesDTO>() {
//
//			@Override
//			public MessagesDTO mapRow(ResultSet rs, int rownum) throws SQLException {
//				//mapRow :  결과 한줄  에 대한 행동  /  while  할 필요 없다  / 자체적으로 부르고 있는중이다
//				//rownum  = index   
//				MessagesDTO tmp = new MessagesDTO();
//				tmp.setSeq(rs.getInt("seq"));
//				tmp.setWriter(rs.getString("writer"));
//				tmp.setContents(rs.getString("contents"));
//				return tmp;
//			}
//			
//		});
//	}

	@Override
	public int deleteMessages(int seq) {
		String sql = "delete messages where SEQ = ?";
		return template.update(sql,seq);
	}

	@Override
	public int modifyMessages(MessagesDTO dto) {
		String sql = "update messages set writer = ?, CONTENTS = ? where seq = ?";
		return  template.update(sql,dto.getWriter(),dto.getContents(),dto.getSeq());
	}

	@Override
	public List<MessagesDTO> getAllData() {
		String sql = "select * from messages";
		return template.query(sql, new RowMapper<MessagesDTO>() {

			@Override
			public MessagesDTO mapRow(ResultSet rs, int rownum) throws SQLException {
				//mapRow :  결과 한줄  에 대한 행동  /  while  할 필요 없다  / 자체적으로 부르고 있는중이다
				//rownum  = index   
				MessagesDTO tmp = new MessagesDTO();
				tmp.setSeq(rs.getInt("seq"));
				tmp.setWriter(rs.getString("writer"));
				tmp.setContents(rs.getString("contents"));
				return tmp;
			}
			
		});
	}
	jdbctemplet 방식 
	*/

	
	
}
