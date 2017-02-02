/**
 * 
 */
package com.f1000.journalrankings.service;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.f1000.journalrankings.backend.DataManager;
import com.f1000.journalrankings.model.Journal;



/**
 * @author Fabrizio Zandonella
 *
 */
public class JournalRankingsServiceImpl implements JournalRankingsService {
	private Logger logger = LogManager.getLogger(JournalRankingsServiceImpl.class);

	@Autowired
	DataManager dataManager;

	/**
	 * Checks if the data into the list passed as param, are valid
	 * 
	 * @param ArrayList<Journal> 
	 * @return ArrayList<Journal>
	 * @throws Exception
	 */
	@Override
	public ArrayList<Journal> rankJournals(ArrayList<Journal> journalList) throws Exception {

		ArrayList<Journal> jList = journalList;
		try{
			if(null== jList ){
				throw new Exception("List of journals is null");
			}	
			if(jList.size() == 0 ){
				throw new Exception("List of journals is void");
			}		

			for(Journal j : jList){
				if(null == j.getJournalName() || "".equalsIgnoreCase(j.getJournalName())){
					throw new Exception("Journal Name is undefined");
				}	
			}

		}catch(Exception ex){
			logger.error("JournalRankingsServiceImpl.rankJournals Error:" + ex.getStackTrace());
			throw new Exception("JournalRankingsServiceImpl.rankJournals Error:" + ex.getStackTrace());
		}

		return dataManager.rankJournals(jList);
	}

}