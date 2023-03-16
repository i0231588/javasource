package ch6;

public class SquareEx1 {

	public static void main(String[] args) {
		Square square1 = new Square(10);
		Square square2 = new Square(20);
		Square square3 = new Square(30);
		
		System.out.println("정사각형의 넓이: "+ square1.getArea());
		System.out.println("정사각형의 넓이: "+ square2.getArea());
		System.out.println("정사각형의 넓이: "+ square3.getArea());

	}

}
