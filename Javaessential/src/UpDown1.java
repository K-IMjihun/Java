import java.util.Random;
import java.util.Scanner;

public class UpDown1 {

	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100);
		System.out.println("Up&Down �����Դϴ� !");
		System.out.println("0�� 99�� �����߿��� �Է����ּ��� .");
		Scanner sc= new Scanner(System.in);
		int count = 1;
		
		while(true) {	//while�� ���ѷ����� �����. 
			int number = sc.nextInt();

			if(number != k && number < k) {
				System.out.println("Up");
				count ++;
			}
			else if (number != k && number > k) {
				System.out.println("Down");
				count ++;
			}
			else if (number == k) {
				System.out.println("�����Դϴ� !");
				System.out.println(count + " ������ ���ּ̽��ϴ�");
				System.exit(0);
				sc.close();
			}
		}


	}

}
