import java.util.Scanner;

public class Arte {

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
		if(coffee == ����������) {
			System.out.println(2000*number + "���Դϴ�");}
		else if(coffee == �Ƹ޸�ī��){
			System.out.println(2500*number + "���Դϴ�");}
		else if(coffee == īǪġ��){
			System.out.println(3000*number + "���Դϴ�");}
		else if(coffee == ī���){
			System.out.println(3500*number + "���Դϴ�");}	
	}
}
