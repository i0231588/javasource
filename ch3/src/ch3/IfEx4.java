package ch3;

import java.util.Scanner;

public class IfEx4 {
//근무시간 입력받기
	//8시간 근무시 시간당 9800일 때
	//초과근무시 1.5배 지급
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*
		 * System.out.println("근무시간 입력해주세요"); int hours =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * //8 * 9800 = 하루일당 // 12시간 근무시 int rate = 9800; int pay=0; //하루일당 if (hours>8)
		 * { pay = (int)((hours-8)*1.5*rate + rate*8); }else { pay = hours *rate; }
		 * System.out.println("하루일당: "+pay);
		 */
		
		
		//키, 몸무게 입력받기
		//저체중, 표준, 과체중 출력
		
		//(키-100)*0.9 < 몸무게 : 과체중
		//(키-100)*0.9 == 몸무게 : 표준
		//(키-100)*0.9 > 몸무게 : 저체중
		
//		System.out.println("키 입력해주세요");
//		int height = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("몸무게 입력해주세요");
//		//int weight = Integer.parseInt(sc.nextLine());
//		double weight = Double.parseDouble(sc.nextLine());
//		
//		double result = (height-100)*0.9;
//		
//		if (result<weight) {
//			System.out.println("과체중");
//		}else if(result==weight) {
//			System.out.println("표준");
//		}else {
//			System.out.println("저체중");
//		}
//		
		//윤년, 평년 구하기
//		int year=2023;
//		//윤년 : 연도를 4로 나눈 나머지가 0이고, 연도를 100으로 나눈 나머지가 0이 아니거나 연도를 400으로 나눈 나머지가 0이면 
//		if (year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println("윤년");
//		} else
//			System.out.println("평년");
//		
		//임의의 숫자 3개 입력받기
		//입력 받는 3개의 숫자 중 가장 작은 수 출력
		System.out.println("숫자를 입력해주세요");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자를 입력해주세요");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자를 입력해주세요");
		int num3 = Integer.parseInt(sc.nextLine());
		
		int min=num1;
		if (min>num2) {
			min=num2;
		}
		if (min>num3) {
			min=num3;
		}
		System.out.println("가장 작은수 "+min);
		
		System.out.println("숫자를 입력해주세요");
		int num4 = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자를 입력해주세요");
		int num5 = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자를 입력해주세요");
		int num6 = Integer.parseInt(sc.nextLine());
		
		int max = num4;
		if (max<num5) {
			max=num5;
		}
		if (max<num6) {
			max=num6;
		}
		System.out.println("가장 큰 수 : "+max);
	
		
//		if (num1<num2 && num1<num3 && num2< num3) {
//			System.out.println("제일 작은 수는 : "+num1);
//		}else if (num2<num1 && num2<num3 && num1<num3) {
//			System.out.println("제일 작은 수는 : "+num2);
//		}else if (num3<num1 && num3<num2 && num2<num3) {
//			System.out.println("제일 작은 수는 : "+num2);
		}
	}

