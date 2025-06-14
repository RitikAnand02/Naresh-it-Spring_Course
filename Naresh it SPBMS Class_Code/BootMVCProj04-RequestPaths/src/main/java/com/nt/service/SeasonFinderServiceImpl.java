package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderServiceImpl implements ISeasonFinderService {

	@Override
	public String findSeason() {
		//get System  Date
		LocalDate  ldt=LocalDate.now();
		//get  current  month of the year
		int month=ldt.getMonthValue();
		if(month>=7 &&  month<=10)
			return  "Rainly Season";
		else if(month>=3 && month<=6)
			return  "Summer Season";
		else
			return "Winter Season";
	}

}
