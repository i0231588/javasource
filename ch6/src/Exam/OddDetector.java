package Exam;

public class OddDetector extends Odd {

	public OddDetector(int oddDetector) {
		super(oddDetector);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isodd() {
		if(getOddDetector()%2==1) {
			return true;
		}
		return false;
	}
}
