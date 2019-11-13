package com.javalec.ex;

public class Calculator {

	private int firstNum;
	private int lastNum;

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

	public void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	public void multi(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	public void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a / b));
	}

}
