package ch6;

public class AccountEx1 {

	public static void main(String[] args) {
		Account account1 = new Account("100-10-10000","홍길동",1000);
		Account account2 = new Account("100-10-10003","성춘향",20000);
		
		//홍길동 계좌 입출금
		System.out.println(account1.owner);
		System.out.println("================================");
		System.out.println("현재 잔액: "+account1.deposit(500000));
		System.out.println("현재 잔액: "+account1.withdraw(230000));

		
		System.out.println();
		//성춘향 계좌 입출금
		System.out.println(account2.owner);
		System.out.println("=================================");
		System.out.println("현재잔액: "+account2.deposit(300000));
		System.out.println("현재잔액: "+account2.withdraw(120000));
	}

}
