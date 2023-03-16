package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Arrays 클래스
 * - 배열을 다루는데 유용한 메서드가 정의되어있음
 * - 모든 메서드는 static임
 * 
 */
public class ArraysEx1 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		//toString
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		int arr2[][]= {{11,12},{21,22}};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr2)); // ==>주소값 나옴
		System.out.println(Arrays.deepToString(arr2)); //2차원 배열일 땐 deepToString 사용해야됨
		
		//equals() : 값비교(두 배열에 저장된 모든 요소를 비교해서 같으면 true 다르면 false)
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D,str2D2)); // 2차원 배열일 땐 값 비교도 deepEquals 사용
		
		
		int arr3[] = new int[5];
		//arr 배열을 arr3로 복사
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr3));
		
		//copyOf(원본배열, 복사할 요소 개수), copyOfRange()
		int arr4[] = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr4));
		
		int arr5[] = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr5));
		
		
		int arr6[] = Arrays.copyOfRange(arr,2,4);//4는 포함하지 않음
		System.out.println(Arrays.toString(arr6));
		
		//fill() : 배열의 모든 요소를 지정된 값으로 채우기
		int arr7[] = new int[5];
		Arrays.fill(arr7, 5); // void 가 return일 때 메소드 호출만 함
		System.out.println("arr7 : "+Arrays.toString(arr7));
		
		
		//sort() : 정렬
		int arr8[] = {3,2,0,1,4};
		Arrays.sort(arr8);
		System.out.println("arr8 : "+Arrays.toString(arr8));
		
		
		//binarySearch() : 이진검색
		//검색
		//순차 검색 - 차례대로 검색하는 방식
		//이진 검색 - 검색할 범위를 반복적으로 절반씩 줄여나가면서 검색하는 방식
		//          정렬이 필수
		System.out.println(Arrays.binarySearch(arr8, 4));
		
		//asList() : 배열을 List 로 변환(크기 변경 불가)
		//T... : 가변인수
		//T : 기본 타입이 아니어야 함
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
		//List<Integer> list = Arrays.asList(arr8);
		Integer[] arr9 = {15,16,17,18};
		List<Integer> list = Arrays.asList(arr9);
		System.out.println(list);
		//List.add(19); 
		
		//list 크기 변경을 원할 때
		list = new ArrayList<>(Arrays.asList(arr9));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
