package shop;

public class CellPhone extends Product{

	
	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier=carrier;
	}

	String carrier; //통신사 정보
	//CellPhone의 이름과 가격 출력
	
	//통신사정보 출력
	public void printExtra() {
		System.out.println("통신사 정보 :"+carrier);
	}
}
