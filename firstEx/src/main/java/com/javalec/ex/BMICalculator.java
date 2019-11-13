package com.javalec.ex;

public class BMICalculator {

	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;

	public void bmiCal(double height, double weight) {
		double h = height * 0.01;
		double bmi = Math.round((weight / (h * h)) * 100) / 100.0;

		System.out.println("BMI 지수 = " + weight + "kg ÷ (" + height + "cm * " + height + "cm)");
		System.out.println("BMI 지수 = " + bmi + "\n");

		if (bmi > obesity) {
			System.out.println("비만 입니다.");
		} else if (bmi > overWeight) {
			System.out.println("과체중 입니다.");
		} else if (bmi > normal) {
			System.out.println("정상 입니다.");
		} else {
			System.out.println("저체중 입니다.");
		}
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

}
