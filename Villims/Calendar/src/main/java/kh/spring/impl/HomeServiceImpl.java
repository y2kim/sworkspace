package kh.spring.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import kh.spring.dto.HomeDTO;
import kh.spring.dto.HomeDescDTO;
import kh.spring.interfaces.HomeDAO;
import kh.spring.interfaces.HomeService;

@Component
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeDAO hdao;

	@Override
	public List<HomeDTO> getAllHomeData() {
		return hdao.getAllHomeData();
	}


	@Override
	public HomeDTO getHomeData(int home_seq) {
		return hdao.getHomeData(home_seq);
	}


	@Override
	public int modifyTitleHomeData(HomeDTO hdto) {
		return hdao.modifyTitleHomeData(hdto);
	}

	@Override
	public int modifyHomeFacSecAccData(HomeDTO hdto) {
		return hdao.modifyHomeFacSecAccData(hdto);
	}

	@Override
	public int modifyHomeLocData(HomeDTO hdto) {
		return hdao.modifyHomeLocData(hdto);
	}

	@Override
	public int modifyReserveCheckinData(HomeDTO hdto) {
		return hdao.modifyReserveCheckinData(hdto);
	}

	@Override
	public int modifyReserveNightData(HomeDTO hdto) {
		return hdao.modifyReserveNightData(hdto);
	}

	@Override
	public int modifyHomeStateData(HomeDTO hdto) {
		return hdao.modifyHomeStateData(hdto);
	}

	@Override
	public int modifyCalendar(HomeDTO hdto) {
		return hdao.modifyCalendar(hdto);
	}

	@Override
	public int modifyHomeRulesDetails(HomeDTO hdto) {
		return hdao.modifyHomeRulesDetails(hdto);
	}

	
	@Override
	@Transactional("txManager")
	public int insertFirstHome(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.insertFirstHome(hdto);
	}


	@Override
	@Transactional("txManager")
	public int modifyHomeType(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomeType(hdto);
	}


	@Override
	@Transactional("txManager")
	public HomeDTO getNewestHomeData() {
		// TODO Auto-generated method stub
		return hdao.getNewestHomeData();
	}


	@Override
	@Transactional("txManager")
	public int modifyBathbed(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyBathbed(hdto);
	}


	@Override
	@Transactional("txManager")
	public int modifyCommodity(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyCommodity(hdto);
	}


	@Override
	@Transactional("txManager")
	public int modifyHomepicture(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomepicture(hdto);
	}


	@Override
	@Transactional("txManager")
	public int insertHomeDescData(HomeDescDTO hddto) {
		// TODO Auto-generated method stub
		return hdao.insertHomeDescData(hddto);
	}


	@Override
	@Transactional("txManager")
	public int modifyContents(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyContents(hdto);
	}


	@Override
	@Transactional("txManager")
	public int modifyHomename(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomename(hdto);
	}


	@Override
	public int modifyHomerule(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomerule(hdto);
	}


	@Override
	public int modifyHomecheck(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomecheck(hdto);
	}


	@Override
	public int modifyHomestay(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomestay(hdto);
	}


	@Override
	public int modifyHomeblock(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomeblock(hdto);
	}


	@Override
	public int modifyHomeprice(HomeDTO hdto) {
		// TODO Auto-generated method stub
		return hdao.modifyHomeprice(hdto);
	}
	
}
