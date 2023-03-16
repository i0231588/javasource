package shop;

public class SmartTv extends Product{
	

	public SmartTv(String name, int price, String resolution) {
		super(name, price);
		this.resolution=resolution;
		// TODO Auto-generated constructor stub
	}
	String resolution;
	//SmartTv의 이름과 가격 출력
	
	//해상도정보 출력
	public void printExtra() {
		System.out.println("해상도 정보 :"+resolution);
	}
}
