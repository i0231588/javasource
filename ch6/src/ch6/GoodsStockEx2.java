package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("상품코드: ");
//		String code = sc.nextLine();
//		System.out.println("재고수량: ");		
//		int stockNum = Integer.parseInt(sc.nextLine());
		
		
//		GoodsStock goodsStock = new GoodsStock(code,stockNum);
//		System.out.print(goodsStock);
		
		//3개의 상품에 대해서 인스턴스를 생성해야 한다면?
		
		GoodsStock[] goods = new GoodsStock[3];
//		goods[0]=new GoodsStock(code,stockNum);
		for (int i = 0; i < goods.length; i++) {
			System.out.print("상품코드: ");
			String code = sc.nextLine();
			System.out.print("재고수량: ");		
			int stockNum = Integer.parseInt(sc.nextLine());
			goods[i] = new GoodsStock(code,stockNum);
			System.out.println("-------------------------------");
		}
		
		//확인용
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
		
		//향상된 for문
		for(GoodsStock goodsStock:goods) {
			System.out.println(goodsStock);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
