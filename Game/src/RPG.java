import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("���⸻�� ���Ű��� ȯ���մϴ�. ĳ���͸� ����ּ���.");
		System.out.println("1. ������ ���ݷ�:5 ");
		System.out.println("2. ���μ�");
		System.out.println("3. ������");
		int number = sc.nextInt();
		if(number == 1) {
			System.out.println("'������'���� ��å �Ͽ����ϴ�.");
		}
	}

}