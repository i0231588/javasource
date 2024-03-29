package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * 클래스 파일 하나에 여러개의 클래스를 작성하는 것이 가능
 * 단, public 클래스는 하나만 존재해야 함
 */

class Product{}
class Tv extends Product{}
class Audio extends Product{}




public class GenericsEx2 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<>();
		ArrayList<Tv> tvList = new ArrayList<>();
		// ?: 와일드 카드
		// <? extends T> : T와 그 자손들만 가능
		// <? super T> : T와 그 조상들만 가능
		
		// <? extends Product> : Product와 그 자손들만 가능
		ArrayList<? extends Product> tvList2 = new ArrayList<Tv>();
		List<Tv> tvList3 = new ArrayList<>();
		
		//ArrayList<Product> : ArrayList에 Product 타입만 추가
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
		
	}
	
	static void printAll(ArrayList<Product> list) { 
		for(Product product:list) {
			System.out.println(product);
		}
	}

}
