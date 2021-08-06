public class BankAccount {
	//1.ĸ��ȭ : ���� �����ڸ� private�� �����ϰ� public���� ���������� ������ �����ش�.
	//�׸��� getter()�� setter()�� ������ ������ �� �ֽ��ϴ�.
	private String accountNumber; //���¹�ȣ
	private String owner; //������
	private int balance; //���� �ܾ�
	
	//ĸ��ȭ ���� ���
	//getter()�޼ҵ� : ������ public���� ������ �����ش�, �� �ҷ�����
	public String getAccountNumber() {
		return accountNumber;
	}
	//setter() �޼ҵ�: ������ public���� ������ �����ش�, �� ����
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposit(int amount) { //�Ա��ϱ�
		balance += amount;
	}
	public void withdraw(int amount) { //����ϱ�
		if(balance >= amount)   //��ݾ׺��� �ܾ��� ũ�ٸ� ��� ����
			balance -= amount;
		else  //�ܾ��� �۴ٸ� ��� �Ұ���
			System.out.println("�ܰ� �����մϴ�.");
	}
	//������ : ��ü�� �����Ǵ� ������ �ڵ����� ȣ���Ѵ�.
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
