package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {

    //want to fetch match data
    //please provide teamName


    Optional<Match> findByTeamHeading(String teamHeading);
}
