public class BankAccount {
	//1.캡슐화 : 접근 지정자를 private로 설정하고 public으로 공개적으로 접근을 열어준다.
	//그리고 getter()와 setter()로 정보를 공유할 수 있습니다.
	private String accountNumber; //계좌번호
	private String owner; //예금주
	private int balance; //현재 잔액
	
	//캡슐화 구현 방법
	//getter()메소드 : 공개된 public으로 접근을 열어준다, 값 불러오기
	public String getAccountNumber() {
		return accountNumber;
	}
	//setter() 메소드: 공개된 public으로 접근을 열어준다, 값 설정
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposit(int amount) { //입금하기
		balance += amount;
	}
	public void withdraw(int amount) { //출금하기
		if(balance >= amount)   //출금액보다 잔액이 크다면 출금 가능
			balance -= amount;
		else  //잔액이 작다면 출금 불가능
			System.out.println("잔고가 부족합니다.");
	}
	//생성자 : 객체가 생성되는 시점에 자동으로 호출한다.
	public BankAccount(String accountNumber, String owner) {
		this.accountNumber = accountNumber;
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
