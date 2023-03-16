package inheritance;  //패키지 명은 소문자
// 클래스관계
// 상속관계(is-a) : Circle is a Point 원은 점이다.
// 포함관계(has-a) : Circle has a Point 원음 점을 가지고 있다.

// Car
// 엔진 클래스
// 도어 클래스


// 포함관계 : 한 클래스의 멤버 변수로 다른 클래스 타입의 참조변수를 선언
public class Circle {
	
	int x;
	int y;
	Point p =new Point();  //포함관계
	
	int r;
	
	

}
