/**
 * 
 */
package com.f1000.journalrankings.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.f1000.journalrankings.model.Journal;


/**
 * @author Fabrizio Zandonella
 *
 */

public class DataManagerImpl implements DataManager {

	/* (non-Javadoc)
	 * @see com.f1000.journalrankings.backend.DataManager#rankJournals(java.util.ArrayList)
	 */

	@Override
	public ArrayList<Journal> rankJournals(ArrayList<Journal> journalList) {

		ArrayList<Journal> j = journalList;
		int rank = 1;
		int index = 0;


		// Review exclusion
		for (int i=j.size()-1;i>=0;i--) {    
			// Do something    
			if(j.get(i).isReview())
				j.remove(i);
		}


		// Sort By Score and in case of equal rank (score) the sort is by Name
		Collections.sort(j, new Comparator<Journal>() {
			public int compare(Journal a, Journal b) {
				if (a.getScore() == b.getScore()){
					return a.getJournalName().compareTo(b.getJournalName());
				}
				return a.getScore() < b.getScore() ? 1 : a.getScore() > b.getScore() ? -1 : 0;
			}
		});

		// Rank assign

		for(Journal jj : j){
			if(index >0 && j.get(index).getScore()!=j.get(index-1).getScore()){
				rank++;
			}
			jj.setRank(rank);
			j.set(index, jj);

			index++;
		}





		return j;
	}




}
