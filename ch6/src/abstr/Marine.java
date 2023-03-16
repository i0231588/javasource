package abstr;

public class Marine extends Unit{
	
	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.println("Marine[X="+x+", Y="+y+"]");
		
	}
}

class Tank extends Unit{
	void changeMode() {}

	@Override
	void move(int x, int y) {
		System.out.println("Tank[X="+x+", Y="+y+"]");
		// TODO Auto-generated method stub
		
	}
}

class DropShip extends Unit{
	void load() {}
	void unload() {}
	@Override
	void move(int x, int y) {
		System.out.println("DropShip[X="+x+", Y="+y+"]");
		// TODO Auto-generated method stub
		
	}
}