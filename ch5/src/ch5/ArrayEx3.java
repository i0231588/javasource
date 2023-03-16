package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		// [] : 1차원 배열
		// [][] : 2차원 배열(행,열이 있음)
		
		// int[] score; 이렇게도 가능
		int score[]= {100,88,100,100,90};
		
		//배열의 총합과 평균
		int sum = 0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		average = sum/(float)score.length;
		System.out.printf("총합: %d 평균: %f",sum,average);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
