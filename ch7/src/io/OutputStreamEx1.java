package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * I/O(Input/output)
 * Input : 키보드
 * Ounput : 화면
 * 스트림(Stream) : 한쪽에서 다른 쪽으로 데이터를 전달하기 위해 두 대상을 연결하고 데이더틀 전송할 수 있는 것
 * 1) 바이트 기반 스트림 : 바이트 단위로 데이터 전송
 *                      FileInputStream, FileOutputStream...  => 대표적
 *                      
 * 2) 문자 기반 스트림 : 문자 단위로 데이터 전송
 *                    FileReader, FileWriter...=> 대표적
 *                    
 */

public class OutputStreamEx1 {

	public static void main(String[] args) {
		InputStream in = System.in;  //키보드
		
		OutputStream out = System.out;//
		
		//입력이 들어오면 읽어오기
		try {
			//read() : 한 바이트만 읽어옴
			//         한글(3byte)은 깨짐
			int input = 0;
			while((input = in.read())!=-1) {
				out.write(input);
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
