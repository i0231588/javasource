package ch6;

public class Member {
	
	//아이디 userid
	//비밀번호 password
	//비밀번호 확인 confirmPassword
	//전화번호 hp
	//주소 address

	String userid;
	String password;
	String confirmPassword;
	String hp;
	String address;
	

	public Member(String userid, String password, String confirmPassword, String hp) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
	}
	
	public Member(String userid, String password, String confirmPassword, String hp, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	}

	boolean passwordAndConfirmPasswordEquals(){
		return password.equals(confirmPassword);
		
	}
}
