package ch4;

import java.util.Iterator;

/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할 때 사용
 * 종류: for(주로사용), while, do-while
 * */
public class WhileEx1 {

	public static void main(String[] args) {
		// 1번) int i = 0; 초기화
		// 2번) i < 10; 조건식(false일 때 반복문 종료)
		// 3번) 조건식이 true일 때 블록 안으로 진입 : 출력문 실행
		// 4번) i++ 실행 ==> i = 1
		// 5번) 2번)으로 가서 반복
		// 6번) 조건식이 true일 때 블록 안으로 진입 : 출력문 실행
		// 조건식이 false가 될 때까지 반복
		
		int i = 0;
		while (i < 10) {
			System.out.println(i+" ");
			i++;
		}
		
		i = 10;
		while (i >= 1) {
			System.out.printf(i+" ");
			i--;
		}
		
		i = 1;
		while (i <= 10) {
			System.out.printf(i+" ");
			i++;
		}
		
		//i+=2 ==> i=i+2
		//1 3 5 7 9 
	
		i = 0;
		while (i <= 10) {
			System.out.printf(i+" ");
			i+=2;
		}
		
		
	
		
		i = 0;
		while (i <= 3) {
			System.out.printf("Hello");
			i++;
		}
		
		
		
		i = 1;
		while (i <= 100) {
			System.out.printf(i+" ");
			i++;
		}
		
		
		
		
		i = 1;
		while (i < 100) {
			System.out.printf(i+" ");
			i+=2;
		}
		
		//1~10까지 덧셈 결과 출력
		System.out.println();
		int sum= 0;	
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.printf("1~10까지의 합"+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
