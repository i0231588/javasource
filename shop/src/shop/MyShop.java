package shop;

import java.util.ArrayList;
import java.util.Scanner;
//배열로 선언된 부분 => ArrayList로 변경(프로그램 수정)

public class MyShop implements IShop {

	//쇼핑몰 이름
		private String title;
		
		//user 정보 저장 배열
		ArrayList<User> users = new ArrayList<>();
		
		//product 정보 저장 배열
		ArrayList<Product> products = new ArrayList<>();
		
		// 구매한 제품을 저장 배열 (cart)
		ArrayList<Product> carts = new ArrayList<>();
		
		//선택된 user 저장
		
		private int selUser;
		Scanner sc = new Scanner(System.in);
		

		@Override
		public void setTitle(String title) {		
			this.title = title;
		}

		@Override
		public void genUser() {		
			//User 2명 생성 후 배열에 저장
			users.add(new User("홍길동", PayType.CARD));
			users.add(new User("성춘향", PayType.CASH));
		}

		@Override
		public void genProduct() {		
			//Product 4개(CellPhone 2개, SmartTv 2개) 생성 후 배열에 저장
			products.add(new CellPhone("갤럭시 노트 10",500000,"SKT"));
			products.add(new CellPhone("애플 아이폰 13",900000,"U+"));
			products.add( new SmartTv("삼성 3D Smart", 1500000, "4K"));
			products.add(new SmartTv("LG Smart Tv", 1200000, "Full HD"));
		}

		@Override
		public void start() {
			System.out.println(title + " : 메인화면 - 계정 선택");
			System.out.println("===========================================");
			
			int i = 0;
			for (User users : users) {
				users.getName();
				users.getPayType();
			}
			
			
			
			System.out.println("[x] 종   료");
			System.out.print("선택 : ");
			String sel = sc.nextLine();
			System.out.println("## "+sel+" 선택 ##");
			System.out.println();
			
			// 0,1 => productList() 호출
			// 다른걸 입력 시 => 메뉴를 확인해 주세요
			switch (sel) {
			case "x": case "X":
				System.exit(0);  //프로그램 종료
				break;
			case "0": case "1":
				selUser = Integer.parseInt(sel);
				productList();
				break;
			default:
				System.out.println("메뉴를 확인해 주세요\n");
				start();
				break;
			}		
		}
	public void productList() {
		System.out.println(title+" : 상품 목록 - 상품 선택");
		System.out.println("===========================================");
		
		
		
		int i = 0;
		for (Product product:products) {
			System.out.printf("[%d]",i);
			product.printDetail();
			product.printExtra();
		}
		
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크 아웃");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		// 상품선택 시 0~3=> cart 제품 추가, productList() 호출
		// h => start 메소드 호출, c => checkOut() 호출
		
		switch (sel) {
		case "0": case "1": case "2": case "3":
			
		
			carts.add(products.get(Integer.parseInt(sel)));
			productList();
			break;

		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			System.out.println("입력값을 확인해 주세요");
			productList();
		}
	}
	
	public void checkOut() { 
		
		System.out.println(title+" : 체크 아웃");
		System.out.println("=========================");
		int total = 0;
		int i = 0;
		for (Product cart : carts) {
			if(cart!=null) {
				System.out.printf("[%d] %s(%d)\n",i++,cart.getName(),cart.getPrice());
				total += cart.getPrice();
			}
		}
		System.out.println("=========================");
		System.out.println("결제방법: "+users.get(selUser).getPayType());
		System.out.println("결제금액: "+total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		
		// p 일 때 productList 호출
		// q 일 때 결제가 완료되었습니다.메세지 후 프로그램 종료
		// 잘못 입력 시 checkOut 호출
		
		switch (sel) {
		case "p": case "P":
			productList();	
			break;
		case "q": case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
			break;

		default: 
			checkOut();
			break;
		}
	}


}