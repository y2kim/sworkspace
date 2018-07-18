package kh.messages.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kh.spring.dto.MessagesDTO;
import kh.spring.interfaces.MessagesDAO;

@Component 
// 서비스 , DAO  같은 애들은   다른용어로 부른다
@Repository
public class MessagesDAOimpl implements MessagesDAO {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public int insert(MessagesDTO dto) throws Exception {
		String sql = "insert into messages values(messages_seq.nextval,?,?)";
		return template.update(sql, dto.getWriter(),dto.getContents());
		
	}
	// 함수 지향  속성   람다식 
	@Override
	public List<MessagesDTO> getAllData() {
		String sql = "select * from messages";
	  return template.query(sql, new RowMapper<MessagesDTO>() {
		  // 아직 트랜잭션 처리는 안한상태 
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

	@Override
	public int delete(int seq) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MessagesDTO dto, int seq) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	} 
	
	
	
	
	
	
//	@Override
//	public int insert(MessagesDTO dto , Connection con) throws Exception {
//		String sql = "insert into messages values(messages_seq.nextval,?,?)";
//		PreparedStatement pstat = con.prepareStatement(sql);
//		pstat.setString(1, dto.getWriter());
//		pstat.setString(2, dto.getContents());
//		int result = pstat.executeUpdate();
//		
//		return result;
//	}
//	
//	@Override
//	public List<MessagesDTO> getAllData(Connection con) throws Exception {
//		String sql = "select * from messages";
//		PreparedStatement pstat = con.prepareStatement(sql);
//		ResultSet rs = pstat.executeQuery();
//		List<MessagesDTO> result = new ArrayList<>();
//		
//		while(rs.next()) {
//			MessagesDTO dto = new MessagesDTO();
//			dto.setSeq(rs.getInt("seq"));
//			dto.setWriter(rs.getString("writer"));
//			dto.setContents(rs.getString("contents"));
//			result.add(dto);
//		}
//		
//		return result;
//	}
//	
//	@Override
//	public int delete(Connection con, int seq) throws Exception {
//		String sql = "delete messages where seq = ? ";
//		PreparedStatement pstat = con.prepareStatement(sql);
//		pstat.setInt(1, seq);
//		int result = pstat.executeUpdate();
//		return result;
//	}
//
//	@Override
//	public int update(Connection con, MessagesDTO dto , int seq) throws Exception {
//		String sql = "update messages set writer = ? , contents = ?  where seq = ? ";
//		PreparedStatement pstat = con.prepareStatement(sql);
//		pstat.setString(1, dto.getWriter());
//		pstat.setString(2, dto.getContents());
//		pstat.setInt(3, seq);
//		int result = pstat.executeUpdate();
//		return result;
//	}
//	
	
	
	
}
