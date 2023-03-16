package ch6;

public class Tv3 {
	/* private: 외부 접근 불가
	 * */
	private String color;
	private int channel;
	private boolean power;
	
	public Tv3(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
	}
	
	
	public Tv3() {
		super();
	}
	
	
	
	void power() {
		power= !power;
	}
	int channerUp() {
		channel++;
		return channel;
	}
	
	void channelDown() {
		channel--;
	}


	//getter/setter 메소드
	//getter: 변수의 값을 리턴하는 형태
	//setter: 변수의 값을 변경하는 형태
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}

}
