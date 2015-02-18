package com.webserv.soap;

import com.webserv.soap.score.Score;
import com.webserv.soap.score.ScoreSOAPService;
import com.webserv.soap.score.ScoreSOAPService_Service;

import java.util.ArrayList;
import java.util.List;

public class ScoreSOAPClient {

	public List<Score> getAllScores() {
			ScoreSOAPService_Service service = new ScoreSOAPService_Service();
			List<Score> scores = service.getScoreSOAPService().getAllScores();
			return scores;
	}
}