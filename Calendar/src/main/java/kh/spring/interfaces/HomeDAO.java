package kh.spring.interfaces;

import java.util.List;
import java.util.Map;

import kh.spring.dto.HomeDTO;
import kh.spring.dto.HomeDescDTO;


public interface HomeDAO {
	public List<HomeDTO> getAllHomeData();

	public HomeDTO getHomeData(int home_seq);
	
	public int modifyTitleHomeData(HomeDTO hdto);

	public int modifyHomeFacSecAccData(HomeDTO hdto);

	public int modifyHomeLocData(HomeDTO hdto);

	public int modifyReserveCheckinData(HomeDTO hdto);

	public int modifyReserveNightData(HomeDTO hdto);

	public int modifyHomeStateData(HomeDTO hdto);

	public int modifyCalendar(HomeDTO hdto);
	
	public int modifyHomeRulesDetails(HomeDTO hdto);
	
	//1step
	public int insertFirstHome(HomeDTO hdto);
	
	public HomeDTO getNewestHomeData();
	
	public int modifyHomeType(HomeDTO hdto);
	
	public int modifyBathbed(HomeDTO hdto);
	
	public int modifyCommodity(HomeDTO hdto);
	
	public int modifyHomepicture(HomeDTO hdto);
	
	public int insertHomeDescData(HomeDescDTO hddto);
	
	public int modifyContents(HomeDTO hdto);
	
	public int modifyHomename(HomeDTO hdto);
	
	public int modifyHomerule(HomeDTO hdto);
	
	public int modifyHomecheck(HomeDTO hdto);
	
	public int modifyHomestay(HomeDTO hdto);
	
	public int modifyHomeblock(HomeDTO hdto);
	
	public int modifyHomeprice(HomeDTO hdto);
}
