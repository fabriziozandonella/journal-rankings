/**
 * 
 */
package com.f1000.journalrankings.service;

import java.util.ArrayList;

import com.f1000.journalrankings.model.Journal;

/**
 * @author Fabrizio Zandonella
 *
 */
public interface JournalRankingsService {

	public ArrayList<Journal> rankJournals(ArrayList<Journal> journalList)  throws Exception;
	
}
