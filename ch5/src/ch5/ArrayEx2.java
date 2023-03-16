package ch5;

import java.lang.reflect.Array;
import java.util.Arrays;

/* 기본타입
 * 참조타입==>String(클래스), 배열, 
 * ㄴ stack,heap 두개의 메모리 사용
 * 
 * */
public class ArrayEx2 {

	public static void main(String[] args) {
		
		int score[]=new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score[i]=i*10;
		}
		System.out.println(score);
		System.out.println(Arrays.toString(score));
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		
		//향상된 for문
		System.out.println();
		for (int i:score) {
			System.out.println(i);
		}
		
		
		int iArr2[]=new int[10];
		
		// 1~10 임의의 숫자를 생성해서 배열에 저장 
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		//출력
		System.out.println(Arrays.toString(iArr2));
		
		
		char chArr[]= {'a','b','c','d','e'};
		System.out.println(chArr);
		
		String strArr[] = {"abc","efg"};
		System.out.println(strArr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
