//	������ = �θ� Ŭ������ ������ ���� Ŭ���� â������
import java.util.Scanner;

public class Tutorial21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�ٳ��� : 1, �ݱ� : 2 ");
		int input = scanner.nextInt();
//		����ڰ� ������ ������ �޾ƿ�
		Fruit fruit;
		if(input == 1) {
			fruit = new banana();
			fruit.show();
			
		}
		else if (input == 2) {
			fruit = new Kinkan();
			fruit.show();
		}
		

	}

}
