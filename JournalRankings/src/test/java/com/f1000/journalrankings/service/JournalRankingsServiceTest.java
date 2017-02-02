/**
 * 
 */
package com.f1000.journalrankings.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.f1000.journalrankings.ApplicationConfig;
import com.f1000.journalrankings.model.Journal;



/**
 * @author Fabrizio Zandonella
 *
 */
public class JournalRankingsServiceTest {
	private Logger logger = LogManager.getLogger(JournalRankingsServiceTest.class);

	private AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	private JournalRankingsService s = (JournalRankingsService) context.getBean("rankJournals");

	/**
	 * Test method for {@link com.f1000.journalrankings.service.JournalRankingsService#rankJournals(java.util.ArrayList)}.
	 */
	@Test
	public void testRankJournalsScenario1() throws Exception{
		logger.info("START Scenario 1");
		assertTrue(s.rankJournals(loadJournalListScenario1()).size()>0);

		String pattern = "|%-5s|%-5s|%-10s|%-5s|%-6s|\n";
		logger.info( String.format(pattern,"Year", "Rank", "Journal", "Score", "Review"));
		for(Journal j : s.rankJournals(loadJournalListScenario1())){

			logger.info(j.toString());

		}

	}

	@Test
	public void testRankJournalsScenario2() throws Exception{
		logger.info("START Scenario 2");
		assertTrue(s.rankJournals(loadJournalListScenario2()).size()>0);

		String pattern = "|%-5s|%-5s|%-10s|%-5s|%-6s|\n";
		logger.info( String.format(pattern,"Year", "Rank", "Journal", "Score", "Review"));
		for(Journal j : s.rankJournals(loadJournalListScenario2())){

			logger.info(j.toString());

		}

	}

	@Test
	public void testRankJournalsScenario3() throws Exception{
		logger.info("START Scenario 3");
		assertTrue(s.rankJournals(loadJournalListScenario2()).size()>0);

		String pattern = "|%-5s|%-5s|%-10s|%-5s|%-6s|\n";
		logger.info( String.format(pattern,"Year", "Rank", "Journal", "Score", "Review"));
		for(Journal j : s.rankJournals(loadJournalListScenario3())){

			logger.info(j.toString());

		}

	}	


	/*
	 * Sample Journal List
	 */
	private ArrayList<Journal> loadJournalListScenario1() throws Exception{
		ArrayList<Journal> journalList = new ArrayList<>();
		Journal jA = new Journal();
		Journal jB = new Journal();
		Journal jC = new Journal();
		jA.setYear(2015);
		jA.setJournalName("Journal A");
		jA.setScore(5.6);

		jB.setYear(2015);
		jB.setJournalName("Journal B");
		jB.setScore(2.4);

		jC.setYear(2015);
		jC.setJournalName("Journal C");
		jC.setScore(3.1);

		journalList.add(jA);
		journalList.add(jB);
		journalList.add(jC);

		return journalList;

	}

	private ArrayList<Journal> loadJournalListScenario2() throws Exception{
		ArrayList<Journal> journalList = new ArrayList<>();
		Journal jA = new Journal();
		Journal jB = new Journal();
		Journal jC = new Journal();
		Journal jE = new Journal();
		Journal jF = new Journal();
		Journal jG = new Journal();
		jA.setYear(2014);
		jA.setJournalName("Journal A");
		jA.setScore(2.2);

		jB.setYear(2014);
		jB.setJournalName("Journal B");
		jB.setScore(6.2);

		jC.setYear(2014);
		jC.setJournalName("Journal C");
		jC.setScore(6.2);

		jE.setYear(2014);
		jE.setJournalName("Journal E");
		jE.setScore(1.2);

		jF.setYear(2014);
		jF.setJournalName("Journal F");
		jF.setScore(1.2);

		jG.setYear(2014);
		jG.setJournalName("Journal G");
		jG.setScore(4.2);

		journalList.add(jA);
		journalList.add(jB);
		journalList.add(jC);
		journalList.add(jE);
		journalList.add(jF);
		journalList.add(jG);

		return journalList;

	}	

	private ArrayList<Journal> loadJournalListScenario3() throws Exception{
		ArrayList<Journal> journalList = new ArrayList<>();
		Journal jA = new Journal();
		Journal jB = new Journal();
		Journal jC = new Journal();
		jA.setYear(2013);
		jA.setJournalName("Journal A");
		jA.setReview(true);
		jA.setScore(5.6);

		jB.setYear(2013);
		jB.setJournalName("Journal B");
		jB.setScore(2.4);

		jC.setYear(2013);
		jC.setJournalName("Journal C");
		jC.setScore(3.1);

		journalList.add(jA);
		journalList.add(jB);
		journalList.add(jC);

		return journalList;

	}	
}
