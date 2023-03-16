package ch6;

public class StudentEx {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동",1,1,100,60,76);
		
		String msg = stu.info();
		System.out.println(msg);
		//msg 출력 시
		//홍길동,1,100,60,76,점수합계,평균
		
		Student2 stu2 = new Student2("성춘향",2,1,78,89,65);
		System.out.println("이름: "+stu2.name);
		System.out.println("총합: "+stu2.getTotal());
		System.out.println("평균: "+stu2.getAverage());
		//성춘향
		//총점
		//평균
		
		

	}

}
