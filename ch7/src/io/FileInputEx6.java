package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {

	public static void main(String[] args) {
		//copy ( C:\\temp\\file1.txt => C:\\temp\\file2.txt
		try {
			//원본 파일 읽기
			// 읽어온 내용을 새로운 파일에 쓰기
			FileInputStream fis = new FileInputStream("C:\\temp\\file1.txt");
			FileOutputStream fos = new FileOutputStream("C:\\temp\\file2.txt");
			 
			 int data = 0;
			 
			 long start = System.currentTimeMillis();
			 
			 while((data=fis.read())!=-1) {
				 fos.write(data);
			 }
			 long end = System.currentTimeMillis();
			 System.out.println("걸린 시간 : " + (end-start)+"ms");
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			//원본 파일 읽기
			// 읽어온 내용을 새로운 파일에 쓰기
			FileInputStream fis = new FileInputStream("C:\\temp\\file1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("C:\\temp\\file2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			 int data = 0;
			 
			 byte b[] = new byte[8192];
			 
			 long start = System.currentTimeMillis(); //시작 시간
			 
			 while((data=fis.read())!=-1) {
				 bos.write(b);
			 }
			 long end = System.currentTimeMillis(); // 종료시간
			 System.out.println("걸린 시간 : " + (end-start)+"ms");
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
