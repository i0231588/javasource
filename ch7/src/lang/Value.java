package lang;

public class Value {
	
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	//Object가 equals()를 주소 비교로 넘겨줌
	//값 비교로 바꾸고 싶음
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Value) {
			//instanceof: 특정 객체의 인스턴스인지 확인
			//obj가 Value 객체의 인스턴스냐?
			Value v = (Value)obj;
			if (this.value ==v.value) {
				return true;
			}
		}
		return false;
	}

	
	// toString(): Object는 패키지명.클래스명@해시코드 값
	// 자손 toString(): 인스턴스에 대한 정보(멤버변수에 할당된 값)를 문자열로 제공하는 목적으로 사용

	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
	
	

	

}
