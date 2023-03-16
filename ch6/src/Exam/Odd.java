package Exam;

public abstract class Odd {

	
	int OddDetector;

	
	public Odd(int oddDetector) {
		super();
		OddDetector = oddDetector;
	}
	
	public int getOddDetector() {
		return OddDetector;
	}
	public void setOddDetector(int oddDetector) {
		OddDetector = oddDetector;
	}


	public abstract boolean isodd();
}
