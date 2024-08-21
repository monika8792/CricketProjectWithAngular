package com.crick.api.Services;

import java.util.List;
import java.util.Map;

import com.crick.api.Entities.Match;

public interface MatchService {
	//getallmatches
	 List<Match> gettAllMatches();
	 
	 //getliveMatches
	 
	 List<Match> getLiveMatches();
	 
	 //get cwo2023 point table
	 
	 List<Map<String,String>>  getPointTable();
}
