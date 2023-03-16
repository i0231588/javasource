package inheritance.code;
//class에 붙으면 상속 금지 의미
public final class FinalTest {
	
	final int MAX_SIZE=10; //상수'
	
	final static int MIN_SIZE=0; //공유(공통)상수
	
	//메소드에 붙으면 오버라이딩 금지 의미가 있음
	final void getMaxSize() {
		final int LV = MAX_SIZE; // 상수
		
		
	}

	
	
}
