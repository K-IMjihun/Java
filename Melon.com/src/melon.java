import java.util.Scanner;

public class melon {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("----Melon----");
		System.out.println("1. ȸ������           ");
		System.out.println("2. �α���              ");
		System.out.println("3. �뷡���           ");  
		System.out.println("4. ���̵�ã��        ");
		System.out.println("5. ��й�ȣã��     ");
		System.out.println("-------------");
		int number = sc.nextInt();
		Privacy[] z = new Privacy[100];
		switch(number) {
			case 1 : {
				if(a < 100) {
					System.out.println("-------ȸ������------");
					System.out.println("����Ͻ� ID�� �Է����ּ���.");
					String ID1 = sc.next();
					System.out.println("����Ͻ� �н����带 �Է��ϼ���.");
					String PW = sc.next();
					if(a > 0) {
						System.out.println("ID �ߺ�Ȯ����...");
						for(int i = 0; i < a; i++) {
							if(z[i].getID().equals(ID1)) {
								System.out.println("���� : ������� ���̵� �Դϴ�.");
								break;
							}
							else {
								z[a] = new Privacy(ID1, PW);
								System.out.println("���̵� �����Ǿ����ϴ�:).");
								System.out.println("�α��� �Ͽ� �̿��� �ֽʽÿ�.");
								break;
							
							}
					}			
			
				}
					else {  //ó�� ������ �ÿ��� �ٷ� ��ϵȴ�.
						z[a] = new Privacy(ID1, PW);
						a++;
						System.out.println("���̵� �����Ǿ����ϴ�:)");
						System.out.println("�α��� �Ͽ� �̿��� �ֽʽÿ�.\n");
						break;
		
			}	
		}
	}
	}
	}
}

