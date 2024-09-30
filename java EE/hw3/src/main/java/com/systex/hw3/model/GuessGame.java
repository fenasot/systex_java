package com.systex.hw3.model;

public class GuessGame {

	private int remains;
	private int luckyNumber;
	
	public GuessGame(int range, int remains) {

		setLuckyNumber(range);
		this.remains = remains;
	}
	
	public boolean guess(int number) {
		if(this.remains > 0) {
			this.remains --;
			return this.luckyNumber == number;			
		}
		return false;
	}
	
	public int getRemains() {
		return remains;
	}

	public int getLuckyNumber() {
		return luckyNumber;
	}

	private void setLuckyNumber(int range) {
		int luckyNumber = (range >= 1 && range <= 99) ? (int)(Math.random() * (double)range + 1) : 10;
		this.luckyNumber = luckyNumber;
	}
	
}
