package ch7;

/* 사용자 정의 예외 작성
 * 개발자만의 예외 클래스를 작성할 때 사용 == Exception or RuntimeException 상속 받아서 만들기
 * 
 * */

public class MyException extends Exception{

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

}
