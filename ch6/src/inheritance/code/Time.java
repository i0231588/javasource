package inheritance.code;

public class Time {
	//접근제어자를 사용하는 이유 ==>캡슐화
	//외부로부터 데이터를 보호하기 위해서
	//외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
	private int hour;
	public int minute;
	public int second;

	public void setHour(int hour) {
		if(hour < 0 || hour > 23)
			return;
		//0~23 일 때만 실행
		this.hour = hour;
	}
	//get메서드 : 멤버변수의 값을 읽는 메서드
	public int getHour() {
		return hour;
	}
	public void setMinute(int minute) {
		//0~59
		if(minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}
	public void setSecond(int second) {
		//0~59
		if(second < 0 || second > 59)
			return;
		this.second = second;
	}
	public int getSecond() {
		return second;
	}
	
}
