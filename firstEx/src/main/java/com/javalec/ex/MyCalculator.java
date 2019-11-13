package com.javalec.ex;

public class MyCalculator {

	public Calculator cal;
	private int firstNum;
	private int lastNum;

	public Calculator getCal() {
		return cal;
	}

	public void setCal(Calculator cal) {
		this.cal = cal;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getLastNum() {
		return lastNum;
	}

	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
	}

	public void add() {
		cal.add(firstNum, lastNum);
	}

	public void sub() {
		cal.sub(firstNum, lastNum);
	}

	public void multi() {
		cal.multi(firstNum, lastNum);
	}

	public void div() {
		cal.div(firstNum, lastNum);
	}

}
