package ch6;

public class Student {
	
	//학생이름 name ex)홍길동
	//반 ban ex) 1
	//번호 no ex) 1
	//국어점수 kor ex)78
	//영어점수 eng ex)65
	//수학점수 math ex)65
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	 public Student(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	 
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	

	String info() {
		
		//국어+영어+수학
		int sum = this.kor+this.eng+this.math;
		double avg = (double)sum/3;
		 
		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
