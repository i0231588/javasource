package inter;

public abstract class Unit {
	
	int x,y;
	
	abstract void move(int x, int y);
	void stop() {
		//자손클래스에서 해야하는 일이 동일하다면 구현해서 상속시키기
		//구현해서 상속시키기
		System.out.println("정지한다");
	}

}
