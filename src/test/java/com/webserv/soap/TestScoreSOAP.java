package com.webserv.soap;

import org.junit.Test;

public class TestScoreSOAP {

	@Test
	public void test1(){
		ScoreSOAPClient scoreSOAPClient = new ScoreSOAPClient();
		scoreSOAPClient.getAllScores();
	}
}
