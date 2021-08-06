public class Customer extends Person{
	
	private long money; //ȸ��, private�� getter�� setter�� �������
	
	public Customer(String name, long money) {
		super(name);
		this.setMoney(money);
	}

	public long getMoney() {
		return money;
	}

	//���1. �ʵ� �Ӽ��� �Է°��� �������ִ� ���
	//���2. �Է°��� ������ üũ�ϴ� ���
	public long setMoney(long money) { //�Է°��� ������ üũ�ϴ� ���
		if(money > 10000) {
			this.money = money;
			return money;
		}
		else
			System.out.println("�ݾ� �Է� ����");
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[�Ϲ�] " + super.toString() + ", ȸ�� : "+ this.getMoney();
	}
	
}
