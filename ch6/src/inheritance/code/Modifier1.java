package inheritance.code;

import modifier.Account;

// 패키지가 다른 경우


// 패키지가 같은 경우

public class Modifier1 {
	Account acc; //참조타입은 null로 세팅
	String str="Hello";
	int age;  // 기본타입은 정수형-0 실수형 0.0 boolean - false로 세팅
	Account account = new Account();
	private void print() {
		System.out.println(acc.getAno());
		System.out.println(str.length());
		System.out.println(age);
	}
		//Account가 가지고 있는 ano 접근하고싶다면
//		String ano = acc.getAno();
//		System.out.println("ano: "+ano);
//		
//		acc.setAno("111-22");
//		
//	}
	public static void main(String[] args) {
		//static 메소드에서 non-static 메소드 호출하기
		//1. 같은 static으로 만들기
		//2. 갱체 생성 후 접근하기
		Modifier1 modifier1 = new Modifier1();
		modifier1.print();
	}

}
