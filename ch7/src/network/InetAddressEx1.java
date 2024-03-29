package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/*
 * 네트워킹
 * 두 대 이상의 컴퓨터를 케이블로 연결하여 네트워크를 구성하는것
 * 
 * 네트워크 어플리케이션 프로그램 작성이 java.net 패키지를 사용함
 * 
 * 서버와 클라이언트
 * 서버: 서비스를 제공하는 컴퓨터
 * 클라이언트 : 서비스를 사용하는 컴퓨터
 * 
 * IP주소 : 호스트를 구별하는데 사용되는 고유한 값
 */

public class InetAddressEx1 {

	public static void main(String[] args) {
		
		InetAddress ip = null;
		
		try {
			//getByName(호스트명) : ip주소를 얻게 됨
			ip = InetAddress.getByName("www.naver.com");
			
			//getHostName() : ip주소를 통해서 호스트명을 얻게 됨
			System.out.println("getHostName() : "+ ip.getHostName());
			
			//getHostAddress: ip주소
			System.out.println("getHostAddress() : "+ ip.getHostAddress());
			
			System.out.println("toString() : "+ ip.toString());
			
			//ip 주소를 byte 배열로 반환
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : "+ Arrays.toString(ipAddr));
			
			String result = "";
			for (int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[i]<0 ? ipAddr[i]+256 : ipAddr[i]+".");
			}
			
			System.out.println("getAddress()+256 : "+result);
			System.out.println();
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			//getAllByName() : 하나의 도메인명에 여러 IP두소가 매핑될 때 모든 IP주소 가져오기
			InetAddress ipArr[] = InetAddress.getAllByName("www.naver.com");
			
			 for (int i = 0; i < ipArr.length; i++) {
				
				 System.out.println("ipArr["+i+"] : " + ipArr[i]);
			}
			 
			 
			 
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
