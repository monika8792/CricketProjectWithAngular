package com.crick.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.api.Entities.Match;

public interface MatchRepo  extends JpaRepository<Match,Integer>{
	//match fetch krna chahta hu  proivide kr de team heading 
	
	Optional<Match> findByTeamHeading(String teamHeading);

}
