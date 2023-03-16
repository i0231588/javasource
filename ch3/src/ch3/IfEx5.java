package ch3;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		//중첩if
		
		//점수를 입력받아서 점수가 90 이상이면 A , 98 이상이면 A+, 90이상 94미만 A-,
		//입력받은 점수가 80 이상이면 B, 88이상이면 B+, 80이상 84 미만이면 B-
		// 80미만인 점수는 C
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 >> ");
		int score = Integer.parseInt(sc.nextLine());
		char grade = ' ', opt='0';
		
		if (score>=90) {
			grade='A';
			if (score>=98) {
				opt='+';
			}else if (score <94) {
				opt='-';
			}
		}else if(score>=80) {
			grade='B';
			if (score>=88) {
				opt='+';
			}else if (score <84) {
				opt='-';
			}
		}else {
			grade='C';
		}System.out.printf("당신의 학점은 %c%c", grade, opt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

