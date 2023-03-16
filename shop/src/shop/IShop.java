package shop;


//인터페이스는 상수만 가질수 있
//모든 메서드는 추상
public interface IShop {

	//public static abstract <-- 자동으로 붙어있음
	void setTitle(String title);
	void genUser();
	void genProduct();
	void start();
	
}
