package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputEx1 {

	public static void main(String[] args) {
		
		// File에서 내용 읽기
		// text,음악, 동영상, 이미지..
		// text, byte 기반(FikeInputStream), 문자기반(FileReader)
		// 음악, 동영상, 이미지 : byte 기반
		 
		try (
			FileInputStream fis = new FileInputStream(".\\src\\io\\FileEx4.java");
			OutputStream out = System.out){
			
//			int data = 0;
//			while((data=fis.read())!=-1) {
//				System.out.println((char)data);
//			}
			
			byte[] b = new byte[4096];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
			
			
			
			
		} catch (Exception e) {
			//FileInputStream() => FileNotFoundException
			//fis.read() =>IOException
			e.printStackTrace();
		}
	}

}

