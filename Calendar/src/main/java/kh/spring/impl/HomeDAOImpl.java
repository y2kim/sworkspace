package kh.spring.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kh.spring.dto.HomeDTO;
import kh.spring.dto.HomeDescDTO;
import kh.spring.interfaces.HomeDAO;

@Component
public class HomeDAOImpl implements HomeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private SqlSessionTemplate ssTemplate;

	@Override
	public List<HomeDTO> getAllHomeData() {
		return ssTemplate.selectList("Home.getAllHomeData");
	}

	@Override
	public HomeDTO getHomeData(int home_seq) {
		return ssTemplate.selectOne("Home.getHomeData", home_seq);
	}


	@Override
	public int modifyTitleHomeData(HomeDTO hdto) {
		String sql = "update home set home_name = ?, home_contents = ? where home_seq = ?";
		return jdbcTemplate.update(sql, hdto.getHome_name(), hdto.getHome_contents(), hdto.getHome_seq());
	}

	@Override
	public int modifyHomeFacSecAccData(HomeDTO hdto) {
		String sql = "update home set home_amenities = ?, home_safety = ?, home_guest_access = ? where home_seq = ?";
		return jdbcTemplate.update(sql, hdto.getHome_amenities(), hdto.getHome_safety(), hdto.getHome_guest_access(),
				hdto.getHome_seq());
	}
	
	//수정--
	@Override
	public int modifyHomeLocData(HomeDTO hdto) {
		String sql = "update home set home_addr1 = ?, home_addr2 = ?, home_addr3 = ?, home_addr4 = ?, home_nation = ?, home_lat = ?, home_lng = ? where home_seq = ?";
		return jdbcTemplate.update(sql, hdto.getHome_addr1(), hdto.getHome_addr2(), hdto.getHome_addr3(),
				hdto.getHome_addr4(), hdto.getHome_nation(), hdto.getHome_lat(), hdto.getHome_lng(),
				hdto.getHome_seq());
	}
	//--수정
	
	@Override
	public int modifyReserveCheckinData(HomeDTO hdto) {
		String sql = "update home set home_checkin_start = ?, home_checkin_end = ?, home_checkout = ? where home_seq = ?";
		return jdbcTemplate.update(sql, hdto.getHome_checkin_start(), hdto.getHome_checkin_end(),
				hdto.getHome_checkout(), hdto.getHome_seq());
	}

	@Override
	public int modifyReserveNightData(HomeDTO hdto) {
		String sql = "update home set home_min_stay = ?, home_max_stay = ? where home_seq = ?";
		return jdbcTemplate.update(sql, hdto.getHome_min_stay(), hdto.getHome_max_stay(), hdto.getHome_seq());
	}

	@Override
	public int modifyHomeStateData(HomeDTO hdto) {
		String sql = "update home set home_state=?, home_rest_start = ?, home_rest_end = ? where home_seq = ?";
		return jdbcTemplate.update(sql, hdto.getHome_state(), hdto.getHome_rest_start(), hdto.getHome_rest_end(),
				hdto.getHome_seq());
	}

	@Override
	public int modifyCalendar(HomeDTO hdto) {
		String sql = "update home set home_blocked_date=?, home_reserve_possible = ?, home_price = ? where home_seq = ?";
		return jdbcTemplate.update(sql, hdto.getHome_blocked_date(), hdto.getHome_reserve_possible(),
				hdto.getHome_price(), hdto.getHome_seq());
	}
	
	@Override
	public int modifyHomeRulesDetails(HomeDTO hdto) {
		String sql = "update home set home_rules=?, home_details = ? where home_seq = ?";
		return jdbcTemplate.update(sql,hdto.getHome_rules(), hdto.getHome_details(), hdto.getHome_seq());
	}
	
	//
	
	@Override
	public int insertFirstHome(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.insert("Home.firststepbyone",hdto);
	}

	@Override
	public int modifyHomeType(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.firststepbytwo", hdto);
	}

	@Override
	public HomeDTO getNewestHomeData() {
		// TODO Auto-generated method stub
		return ssTemplate.selectOne("Home.getNesestHomeData");
	}

	@Override
	public int modifyBathbed(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.firststepbythree", hdto);
	}

	@Override
	public int modifyCommodity(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.firststepbyfinal", hdto);
	}

	@Override
	public int modifyHomepicture(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.secondstepbyone", hdto);
	}

	@Override
	public int insertHomeDescData(HomeDescDTO hddto) {
		// TODO Auto-generated method stub
		return ssTemplate.insert("HomeDesc.secondstepbytwosub", hddto);
	}

	@Override
	public int modifyContents(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.secondstepbytwo", hdto);
	}

	@Override
	public int modifyHomename(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.secondstepbyfinal", hdto);
	}

	@Override
	public int modifyHomerule(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.thirdstepbyone",hdto);
	}

	@Override
	public int modifyHomecheck(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.thirdstepbytwo", hdto);
	}

	@Override
	public int modifyHomestay(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.thirdstepbythird", hdto);
	}

	@Override
	public int modifyHomeblock(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.thirdstepbyfore", hdto);
	}

	@Override
	public int modifyHomeprice(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return ssTemplate.update("Home.thirdstepbyfive", hdto);
	}
	
}
