import java.util.Scanner;

public class EDIYA2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("� ���Ḧ �ֹ��Ͻðڽ��ϱ�?");
		System.out.println("-----�޴���-----");
		System.out.println("���������� : 2,000");
		System.out.println("�Ƹ޸�ī�� : 2,500");
		System.out.println("īǪġ�� : 3,000");
		System.out.println("ī��� : 3,500");
		String coffee = sc.next();
		int number = sc.nextInt();
		switch(coffee) {
		case "����������" :
			System.out.println("���������� " + number + " �� ���Խ��ϴ�");
			System.out.println(2000*number + "���Դϴ�"); break;
		case "�Ƹ޸�ī��" :
			System.out.println("�Ƹ޸�ī�� " + number + " �� ���Խ��ϴ�");
			System.out.println(2500*number + "���Դϴ�"); break;
		case "īǪġ��" :
			System.out.println("īǪġ�� " + number + " �� ���Խ��ϴ�");
			System.out.println(3000*number + "���Դϴ�"); break;
		case "ī���" :
			System.out.println("ī��� " + number + " �� ���Խ��ϴ�");
			System.out.println(3500*number + "���Դϴ�"); break;
		}
		sc.close();
	
		}
		

}
