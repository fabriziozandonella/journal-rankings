/**
 * 
 */
package com.f1000.journalrankings.backend;

import java.util.ArrayList;

import com.f1000.journalrankings.model.Journal;

/**
 * @author Fabrizio Zandonella
 *
 */
public interface DataManager {

	public ArrayList<Journal> rankJournals(ArrayList<Journal> journalList);
	
}
