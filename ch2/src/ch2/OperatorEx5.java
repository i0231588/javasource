package ch2;

import java.util.Scanner;

/* 연산자
 * 1) 단항연산자
 * 		+, -, ++, --, ~, !
 * 2) 이항연산자
 * 		산술 : +, -, *, /, %, <<, >>, >>>
 * 		비교 : >, < , >=, <=, ==(값이 같다면), !=(값이 같지 않다면)
 * 		논리: &&(and), &(and), ^(xor), ||(or), |(or) 
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =     ex) a=4;
 * 
 * 연산자 우선순위 
 * 
 * 
 * 
 * */
public class OperatorEx5 {

	public static void main(String[] args) {
		
		// 문1)534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
		// 학생 한 명당 몇 개를 가질 수 있고, 연필의 나머지는 몇 개인지 출력하기
		//출력) 학생 한명당 : 30
		// 	   남은 연필 수 : 5
		
		//문2) 사다리꼴 너비 구하기
		//윗변 : 5, 아랫변 : 10, 높이 : 7 인 사다리꼴 너비 구하기
		//	    변수 사용, 소수 자릿수까지 출력
		
		//문3) 한달 월급을 10년동안 저축할 때 최종 저축금액 구하기
		//	   조건 : 사용자로부터 한 달 월급 입력 받기
		// 	   출력 : 10년 저축 금액: 2000000
		
		//문4) 화씨 온도를 섭씨 온도로 변경하기
		// 	   화씨 온도가 100일 때 섭씨온도가 얼마인지 출력하기
		// 섭씨온도 = 5/9 *(화씨온도-32)
		
		int p=534, s=30;
		System.out.println("학생 한명당 : "+(p/s));
		System.out.println("남은 연필 수 : "+(p%s));
		
		int top=5, bottom=10, height=7;
		double area=(top+bottom)*height/2.0;
		System.out.println("사다리꼴 너비 "+area);
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("한달월급을 입력하세요");
		//입력받기
		int salary = Integer.parseInt(sc.nextLine());
		int deposit = salary*12*10;
		System.out.println("10년 저축금액: "+deposit);
		
		int fahr =100;
		double cels = 5/9.0 * (fahr-32);
		System.out.println("섭씨온도 : "+cels);
		
		
		//문5) 삼항연산자 이용
		//		int num=10 일 때 num이 양수인지 음수인지 0인지 출력
		
		//문6 숫자를 입력받아 짝수인지, 홀수인지 출력하기
		
		int num=10;
		String result = num>0?"양수":(num<0?"음수":"0");
		System.out.println(result);
		
		System.out.println("숫자를 입력해주세요");
		int input = Integer.parseInt(sc.nextLine());
		result = input%2==0?"짝수":"홀수";
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
