package ch6;

public class Numbers {
	int num[];

	public Numbers(int[] num) {
		super();
		this.num = num;
	}

	//배열 총합
	int getTotal() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	//배열  평균
	int getAverage() {
		
		return getTotal()/num.length;
		
	}

}
