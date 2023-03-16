package ch5;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
				};
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d) %s의 뜻은?\n",i+1,words[i][0]);
			System.out.println("정답 입력: ");
			//답변 입력
			String word = sc.nextLine();
			// 정답과 답변 비교
			if (words[i][1].equals(word)) {
				System.out.println("정답");
			} else {
				System.out.printf("오답. 정답은 %s 입니다.\n",words[i][1]);
			}
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
