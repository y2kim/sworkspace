package kh.spring.cale;

import java.time.YearMonth;

public class Test {
	public static void main(String[] args) {
		for(int i = 1999;i<3000;i++) {
			YearMonth yearMonthObject = YearMonth.of(i, 2);
			int daysInMonth = yearMonthObject.lengthOfMonth(); //28  
			System.out.println(i+"년도 : " + daysInMonth);
		}
	}
}
