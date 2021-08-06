import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		boolean isStop = false;
		int c=0; //�� ���� ���¸� �����ߴ��� ī��Ʈ��
		Scanner sc = new Scanner(System.in);
		BankAccount [] b1 = new BankAccount[100]; //��ü �迭 �����
		do {
			System.out.println("===���±��� ���α׷�===");
			System.out.println("*   1. ���°���        *");
			System.out.println("*   2. �Ա��ϱ�        *");
			System.out.println("*   3. ����ϱ�        *");
			System.out.println("*   4. �ܾ���ȸ        *");  //���¹�ȣ�� �Է��ϸ� ���� �ܾ��� �˷���
			System.out.println("*   5. ������ȸ        *");  //�̸��� �Է��ϸ� �ش� ���� ��ȣ�� �˷���
			System.out.println("*   9. �����ϱ�        *");
			System.out.println("=================");
			System.out.print("  �޴��� �����ϼ��� >>> ");
			String command = sc.next();
			switch(command) {
				case "1":{
					if(c<100) {
						System.out.println("   < ���°���  >");
						System.out.print("���¹�ȣ : "); String accNumber = sc.next();
						System.out.print("������ : "); String accOwner = sc.next();
						System.out.print("�ܾ� : "); int money = sc.nextInt();
						if(c>0) { //ó�� ������ �ƴ� �� ���¹�ȣ�� Ȯ���Ͽ� ���¹�ȣ �ߺ��� ���ش�.
							System.out.println("���¹�ȣ Ȯ����...");
							for(int i=0;i<c;i++) {
							if(b1[i].getAccountNumber().equals(accNumber)) { //�Է��� ��ȣ�� �̹� �ִٸ�
								System.out.println("���� ���� : ���¹�ȣ �ߺ��Դϴ�.\n"); //��ϵ����ʰ� ����
								break;
							}
							else if(i==c-1) {  //�ߺ����� �ʾҴٸ� ���
								b1[c] = new BankAccount(accNumber, accOwner);
								b1[c].setBalance(money);
								c++;
								System.out.println("��ϵǾ����ϴ�.\n");
								break;
							}	
							}
						}
						else {  //ó�� ������ �ÿ��� �ٷ� ��ϵȴ�.
							b1[c] = new BankAccount(accNumber, accOwner);
							b1[c].setBalance(money);
							c++;
							System.out.println("��ϵǾ����ϴ�.\n");
						}
					
						System.out.println("**���� ��ȸ **");  //��ϵ� ���¹�ȣ ��ü ��ȸ
						System.out.println("===============================================");
						System.out.print("   ��ȣ                 ���¹�ȣ");
						System.out.print("\t            ������            �����ܾ�\n");
						for (int i = 0; i < c; i++) {
							if(b1[i] != null){
								System.out.printf("%3d %13s",i+1,b1[i].getAccountNumber());
								System.out.printf("%16s %10d\n",b1[i].getOwner(),b1[i].getBalance());
			                }
			            }
						System.out.println("===============================================\n");					
					}
					else //��� ������ ����(100)�� �ѰԵǸ� ����
						System.out.println("���� ������ �ʰ��Ͽ����ϴ�...\n");
				}break;
				
				case "2":{
					System.out.println("**�Ա� �ϱ� **");  //��ϵ� ���¹�ȣ ��ü ��ȸ
					System.out.print("���¹�ȣ : "); String accNumber =sc.next();
					for(int i=0;i<b1.length;i++) {  //b1�迭 ��ü �����ϱ�
						try {
								if(accNumber.equals(b1[i].getAccountNumber())) {  //�Է��� ���¹�ȣ�� ��ϵ� ���¹�ȣ ã��
								System.out.print("�Աݾ� : "); int amount = sc.nextInt();
								b1[i].deposit(amount);  //�Ա��ϱ�
								System.out.println("���� �ܾ��� "+b1[i].getBalance()+"�Դϴ�.\n");
								break;
								}
						}catch(NullPointerException e) {  //���� ���¹�ȣ�� �Է��� �� ����ó��
								System.out.println("��ġ�ϴ� ���� ��ȣ�� �����ϴ�.\n");
								break;
						}
					}
				}break;
				
				case "3":{
					System.out.println("**��� �ϱ� **");  //��ϵ� ���¹�ȣ ��ü ��ȸ
					System.out.print("���¹�ȣ : "); String accNumber = sc.next();
					for(int i=0;i<b1.length;i++) {
						try {
							if(accNumber.equals(b1[i].getAccountNumber())) {
								System.out.println("< ����ϱ� >");
								System.out.print("��ݾ� : "); int amount = sc.nextInt();
								b1[i].withdraw(amount); //����ϱ�
								System.out.println("���� �ܾ��� "+b1[i].getBalance()+"�Դϴ�.\n");
								break;
							}
						}catch(NullPointerException e) {  //���� ���¹�ȣ�� �Է��� �� ����ó��
								System.out.println("��ġ�ϴ� ���� ��ȣ�� �����ϴ�.\n");
								break;
						}
					}
				}break;
				
				case "4":{
					System.out.println("**�ܾ� ��ȸ **");  //��ϵ� ���¹�ȣ ��ü ��ȸ
					System.out.print("���¹�ȣ : "); String accNumber = sc.next();
					for(int i=0;i<b1.length;i++) {
						try {
							if(accNumber.equals(b1[i].getAccountNumber())) {
							System.out.println("���� �ܾ��� "+b1[i].getBalance()+"�Դϴ�.\n");
							break;
							}
						}catch(NullPointerException e) {
								System.out.println("���°� �����ϴ�.\n");
								break;
						}
					}	
				}break;
				
				case "5":{
					System.out.println("**���� ��ȸ **");  //�̸��� �Է��Ͽ� �ش� �̸����� ��ϵ� ���¹�ȣ ��ȸ
					System.out.print("�̸� : "); String accOwner = sc.next();
					for(int i=0;i<b1.length;i++) {
						try {
							if(accOwner.equals(b1[i].getOwner())) {  //�Է��� �̸����� ��ϵ� �̸� ã��
							System.out.println(accOwner+"���� ���� ��ȣ�� "+b1[i].getAccountNumber()+"�Դϴ�.\n");
							break;  //�ش� ���¹�ȣ�� �˷���
							}
						}catch(NullPointerException e) {  //���� �̸��� �Է��� �� ����ó��
								System.out.println("��ϵ� �̸��� �����ϴ�.\n");
								break;
						}
					}	
				}break;
				
				case "9": //�����ϱ� ����
					System.out.println("���°��� ���α׷� ���� ��...");
					isStop = true;
					System.out.println("���°��� ���α׷� ����Ǿ����ϴ�.");
					break;
				
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
			}
		}while(!isStop);
	}

}
