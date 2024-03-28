package com.crick.apis.controller;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MstchController {

    private MatchService matchSevice;

    public MstchController(MatchService matchSevice) {
        this.matchSevice = matchSevice;
    }

    // get live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchSevice.getLiveMatches(), HttpStatus.OK);
    }
  // get All matches
    @GetMapping
    public  ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchSevice.getAllMatches(), HttpStatus.OK);
    }

    // get Point Table
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchSevice.getPointTable(), HttpStatus.OK);
    }
}
