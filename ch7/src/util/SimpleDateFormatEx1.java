package util;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class SimpleDateFormatEx1{
public static void main(String[] args) {
	
		
		//시스템 날짜와 시간 객체
		Date date = new Date();
		System.out.println(date);
		//날짜와 시간을 특정 형식에 맞춰 출력 가능하게 하는 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		// y : 년도, M : 월, d : 일, h : 시, m : 분, s : 초, H : 24시간제 시, a : 오전/오후
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		
		// exception 예외 - 컴파일 예외
		try {
			// parse() 날짜 데이터의 출력 형식을 변환
			Date d = sdf3.parse("2023년 03월 09일");
			System.out.println(sdf4.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
