package lang;

import java.util.Arrays;

public class StringEx2 {

	public static void main(String[] args) {

		//String 생성자
		char c[]= {'H','e','l','l','o'};
		String str1 = new String(c);
		System.out.println(str1);
		
		String str2 = "Hello";
		
		//length
		System.out.println("길이"+str1.length());
		
		//charAt(int index): char => charAt 호출시 int 매개변수를 넣어서 호출하고 결과값은 char받는다.
		//str1.charAt(0);
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));
		
		String str3 = "자바 프로그래밍프";
		//str3 문자열에 '프' 문자가 들어있는지 확인
		for (int i = 0; i < str3.length(); i++) {
			if (str3.charAt(i)=='프') {
				System.out.println("있");
				break;
			}
		}
		
		int cnt = 0; //프 문자 갯수를 세는 변수
		for (int i = 0; i < str3.length(); i++) {
			if (str3.charAt(i)=='프') {
				cnt++;
			}
		}
		System.out.println(cnt>0?"프가 들어있음":"");
		
		// indexOf(int ch) : 주어진 문자 ch가 문자열에 들어있는지 확인하고 위치를 리턴(못찾으면 -1 리턴)
		System.out.println("indexOf(int ch): "+str2.indexOf('o'));
		System.out.println("indexOf(String str): "+str2.indexOf("o"));
		System.out.println("indexOf(String str): "+str2.indexOf("llo"));
		System.out.println("indexOf(int ch int fromIndex): "+str2.indexOf('e',0));
		System.out.println("indexOf(int ch int fromIndex): "+str2.indexOf('e',2));
		
		//lastIndexOf(); : 위치를 찾을 때 오른쪽 끝부터 찾음
		System.out.println("lastIndexOf(int ch): "+str2.lastIndexOf('o'));
		
		
		//str3 문자열에 '프' 문자가 들어있는지 확인: indexOf()
		System.out.println(str3.indexOf('프')>-1?"프가 들어있음":"");
		
		//subString() : 입력한 int를 index로 받아 그 인덱스부터 시작하는 문자열 얻기
		String ssn = "880515-122012";
		//subString(int beginIndex)
		String result = ssn.substring(3);
		System.out.println(result);
		//subString(int beginIndex,int endIndex) : 입력한 int를 index로 받아 첫번째 입력한 인덱스부터 시작하고 두번째 입력한 인데스 전까지의 문자열 얻기
		System.out.println("subString(int beginIndex,int endIndex) "+ ssn.substring(3, 8));
		
		//concat(String str) : +와 같은 역할을 함
		String result2 = str2.concat("안녕하세요");
		System.out.println(result2);
		
		//startWith(String prefix):  prefix로 시작하느냐?
		//startWith(String prefix,int toOffset)
		String str4 = "java.lang.Object";
		boolean result3 = str4.startsWith("java");
		System.out.println(result3);
		System.out.println("startWith(String prefix,int toOffset)"+ str4.startsWith("java", 0));
		
		//endWith():  suffix로 끝나느냐?
		System.out.println("endWith(String prefix)"+ str4.endsWith("java"));
		
		//contains(Charsequence s): s 문자열이 포함되었는지
		System.out.println("contains(Charsequence s)"+str2.contains("Hello"));
		
		//replace(원본문자열, 변경문자열)
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		str5.replace("자바", "java");
		System.out.println(str5.replace("자바", "java"));
		System.out.println(str5); // String은 변경 불가능이라 안바뀜
		//원본 문자열 변경을 하려면 새로운 문자열로 리턴되는 값을 다시 담아줘야 한다
		str5 = str5.replace("자바", "java");
		System.out.println(str5);
		
		System.out.println(str2.replace("H", "h"));
		
		//replaceFirst(String regex, String replacement) : 첫번째 것만 변경
		System.out.println(str5.replaceFirst("java", "자바"));
		System.out.println(str5.replaceAll("java", "자바"));
		
		
		//trim() : 양쪽 공백 제거(중간 공백 제거 못함)
		String str6 = "   Hello World   ";
		System.out.println(str6);
		System.out.println(str6.length());
		System.out.println("trim() : "+str6.trim());
		System.out.println(str6.equals("Hello world"));
		
		// static String valueOf : 지정된 값을 문자열로 변환하면 반환
		System.out.println(String.valueOf(true)); // ==>"true"로 반환한 것
		System.out.println(String.valueOf(c)); // ==> "c"로 반환
		System.out.println(String.valueOf(100)); // ==> "100"로 반환
		
		
		// a를 문자열로 변경
		int a = 100;
		String str7 = a + "100";
		System.out.println(str7);
		
		// toLowerCase() / toUpperCase()
		System.out.println(str2.toLowerCase());  //모든 문자열을 소문자로 변경
		System.out.println(str2.toUpperCase());  //모든 문자열을 대문자로 변경
		
		//split()
		String animals = "dog,cat,bear";
		//regex : Regular expression(정규표현식) - 특정한 규칙을 가진 문자열의 집합
		String[] arr = animals.split(",");
		System.out.println(arr);
		
		//for
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//split(String regex, int limit) : regex로 나누되, limit로 나누기
		arr = animals.split(",",2); // 콤마로 나누되 두개의 그룹으로 나눠라
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//compareTo(String str) : 문자열 비교(사전 순서)
		// 같으면 0, 사전 순으로 이전이면 음수, 이후이면 양수
		System.out.println("aaa".compareTo("aaa")); // 0
		System.out.println("aaa".compareTo("bbb")); // -1
		System.out.println("bbb".compareTo("aaa")); // 1
		System.out.println("aaa".compareTo("abc")); // -1
		
		// split() <--> join()
		// join() : 특정 문자열로 결합
		arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		String str8 = String.join("-", arr);
		System.out.println("join() : "+str8);
		
		
		
		
		
		
		
		
		
	}

}
