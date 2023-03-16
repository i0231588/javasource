package ch7;
/*
 * 컴파일 에러 : 컴파일 시에 발생하는 에러
 * 런타임 에러 : 실행 시에 발생하는 에러
 * 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것
 * 
 * 에러: 코드에 의해서 수습될 수 없는 심각한 오류 ex) 메모리부족, 스택오버플로우
 * 예외: 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * Exception 
 * 1) Exception 클래스들: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 * 2) RuntimeException 클래스들: 프로그래머의 실수로 발생하는 예외
 *      -배열 범위 벗어나기, NullPointerException, ClassCastException
 *      
 *  Exception 처리
 *  try ~ catch     
 *  예외 던지기
 *  
 * */
public class ExceptionEx4 {

	public static void main(String[] args) {
		
		//null : 값이 할당되지 않았음
		//참조형 초기화
		
		String data = null;
		Account account = null;
		
		int[] arr = null;
		
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);
		
		System.out.println(data.length());
		
		
		
		

	}

}
