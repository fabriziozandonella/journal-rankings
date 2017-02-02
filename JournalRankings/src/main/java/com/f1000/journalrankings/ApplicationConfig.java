/**
 * 
 */
package com.f1000.journalrankings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.f1000.journalrankings.backend.DataManager;
import com.f1000.journalrankings.backend.DataManagerImpl;
import com.f1000.journalrankings.service.JournalRankingsService;
import com.f1000.journalrankings.service.JournalRankingsServiceImpl;
 
 
/**
 * @author Fabrizio Zandonella
 *
 */
public class ApplicationConfig {

	
	@Bean(name="dataManager")
	public DataManager dataManager() {
		return new DataManagerImpl();
	}	
	
	@Bean(name="rankJournals")
	@Scope("singleton")
	public JournalRankingsService rankJournals() {
		return new JournalRankingsServiceImpl();
	}	
}
