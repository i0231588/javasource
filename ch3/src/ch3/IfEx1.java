package ch3;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		/*조건문
		 * 조건식과 실행됳ㄹ 하나의 문장 또는 블럭으로 구성됨
		 * 종류 : if(주로사용), switch
		 * 
		 * 1.if
		 * 2)if
		 * 3)if~else
		 * 4)if~else if
		 */
		
		//조건: true나 false로 판별되어야 함
//		if (condition) {
//			//블럭 실행 여부는 조건이 true일 때만 실행됨
//		}
//		
//		
//		if (condition) {
//			//블럭 실행 여부는 조건이 true일 때만 실행됨
//		} else {
//			//false일 때
//		}
//		
//		//조건이 여러개일 때
//		if (condition1) {
//			//블럭 실행 여부는 조건이 true일 때만 실행됨
//		} else if(조건2) {
//			//true일 때
//		} else if(조건 3) {
//			//true일 때
//		}
		
//		
//		int num = 0;
//		//num값이 0이라면 num = 0 출력하기
//		if (num==0) {
//			System.out.println("num=0");
//			
//		}
//		
//		//num값이 0이 아니라면 num!=0 출력하기
//		if (num!=0) {
//			System.out.println("num!=0");
//			
//		}
//		
//		//score가 60 이상이면 합격 출력
//		 int score=88;
//		 if (score>=60) {
//			 System.out.println("합격");
//			
//		}
//
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("점수입력");
//		 score = Integer.parseInt(sc.nextLine());
//		 if (score>=60) {
//			 System.out.println("합격");
//			
//		} else {
//			System.out.println("불합격");
//		}
		int jumsu = 70;
		//지역변수 초기화 후 사용
		char grade = ' ';
		if (jumsu >= 90) {
			grade = 'A';
		} else if (jumsu >= 80) {
			grade = 'B';
		} else if (jumsu >= 70) {
			grade = 'C';
		} else if (jumsu >= 60) {
			grade = 'D';
		} else if (jumsu >= 50) {
			grade = 'E';
		}
		System.out.printf("점수: %d, 등급: %c\n",jumsu, grade);
	}

}
