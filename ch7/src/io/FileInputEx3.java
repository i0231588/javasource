package io;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;

public class FileInputEx3 {

	public static void main(String[] args) {
		//FileInputEx1.java를 읽어서 화면 출력
		//행 번호와 같이 출력(FileReader, Writer)
		
		
//		try (
//				FileReader fis = new FileReader(".\\src\\io\\FileEx1.java");
//				PrintStream out = System.out) {
//
//			int data = 0;
//			int row = 1;
//
//			System.out.print(row+"    ");
//
//			while((data=fis.read())!=-1) {
//				out.print((char)data);
//
//
//				if(data=='\n') {
//					row++;
//					out.print(row+"   ");
//				}
//			}
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}

		
		//FileReader / BufferedReader 변경
		try (
				FileReader fis = new FileReader(".\\src\\io\\FileEx1.java");
				BufferedReader br= new BufferedReader(fis)) {

			String str = null;

			int i = 1;
			while((str=br.readLine())!=null) {
				System.out.println(i+" "+str);
				i++;
				
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		
		
		
		
		
		
	}

}
