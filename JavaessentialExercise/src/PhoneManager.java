import java.util.Scanner;

class Phone	{
		String name;
		String tel;
		public Phone(String name, String tel) {
			this.name = name;
			this.tel = tel;
		}
		public String getName() {return name;}
		public String getTel() {return tel;}
		
		}

public class PhoneManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ο��� >> ");
		int persons = sc.nextInt();
		Phone[] person = new Phone[persons];
		for(int i = 0; i < persons; i++) {
			System.out.println(" �̿����� �̸��� ��ȣ�� �������� �Է� : ");
			person[i] = new Phone(sc.next() , sc.next()); }
	System.out.println("����Ǿ����ϴ�.");
	label : while(true) {
		System.out.println("�˻� �� �̸� : ");
		String SN = sc.next();
		for(int i = 0; i < persons; i++) {
		if(SN.equals("exit")) {
		 break label ;
			}
		else if(SN.equals(person[i].getName())) {
			System.out.println(person[i].getName() + " �� ��ȣ�� " + person[i].getTel());
		}
		else if (!SN.equals(person.clone()[i].getName()) && i == (persons - 1)) {
			System.out.println("��Ͼȵ�");
			break;
			
		}
		}
		System.out.println("�ý����� ����");
		sc.close();
	}
	}
}