public class Customer extends Person{
	
	private long money; //회비, private은 getter와 setter를 써줘야함
	
	public Customer(String name, long money) {
		super(name);
		this.setMoney(money);
	}

	public long getMoney() {
		return money;
	}

	//기능1. 필드 속성에 입력값을 저장해주는 기능
	//기능2. 입력값의 오류를 체크하는 기능
	public long setMoney(long money) { //입력값의 오류를 체크하는 기능
		if(money > 10000) {
			this.money = money;
			return money;
		}
		else
			System.out.println("금액 입력 오류");
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[일반] " + super.toString() + ", 회비 : "+ this.getMoney();
	}
	
}
