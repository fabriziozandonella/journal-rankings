/**
 * 
 */
package com.f1000.journalrankings.model;

/**
 * @author Fabrizio Zandonella
 *
 */
public class Journal {
	// Assuming the year as an int type
	private int year = 0;
	private int rank = 0;
	private String journalName = null;
	private double score = 0.0;
	private boolean review = false;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getJournalName() {
		return journalName;
	}
	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}

	public double getScore() {
		return score;
	}
	public void setScore(double d) {
		this.score = d;
	}
	public boolean isReview() {
		return review;
	}
	public void setReview(boolean review) {
		this.review = review;
	}
	
	@Override
	public String toString() {
		String pattern = "|%-5s|%-5s|%-10s|%-5s|%-6s|\n";
		return String.format(pattern,year,rank ,journalName, score, review);
	}
}
