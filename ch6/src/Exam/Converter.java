package Exam;

import java.util.Scanner;

public abstract class Converter {
	private double ratio;
	public abstract double convert(double src); //src/1200

	public abstract String getSrcString(); // return "원"

	public abstract String getdesString();// return "달러"

	public double getRatio() {
		return ratio;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을(를) " + getdesString() + "로 바꿉니다.");
		System.out.println(getSrcString() + "을(를) 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : " + res + getdesString() + "입니다.");
	}

}
