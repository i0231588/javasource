package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("hong123","hong123@","hong123@","01012345678");
		Member member2 = new Member("hong123","hong123@","hong123@","01012345678","서울 종로구");

		if (member1.passwordAndConfirmPasswordEquals()) {
			System.out.println("비밀번호 일치");
			
		} else{
			System.out.println("비밀번호 확인해주세요");// true 라면 번호가 일치합니다
		}
		System.out.println(member2.passwordAndConfirmPasswordEquals()?"비밀번호 일치":"비밀번호 확인");
		
		                                           // false 라면 비밀번호를 확인해주세요 메시지 출력
		memberInfo(member1); //member1과 member2 내용 출력
		memberInfo(member2); //member1과 member2 내용 출력
	}
	
	static void memberInfo(Member member) {
		//출력결과
		//아이디 
		System.out.println("아이디: "+member.userid);
		// 비번
		System.out.println("비밀번호: "+member.password);
		//전화번호
		System.out.println("전화번호: "+member.hp);
		// 주소
		System.out.println("주소: "+member.address);
	}

}
