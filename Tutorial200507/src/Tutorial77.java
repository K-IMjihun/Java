import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tutorial77 {

	public static void main(String[] args) {
	
		File file = new File("input.txt");
//		input.txt�� �о file ������ ó���� �� �ֵ��� ��
		try {
//		try, catch�� 
//		���α׷��� �������� ���� �� �ʼ������� ����ڰ� ���� �� �־����
			Scanner sc = new Scanner(file);
//			�ܼ�â�� �ƴ϶� file���� �Է��� �ޱ⶧���� �Ű������� �־���
			while(sc.hasNextInt())
//				sc�� �������� �о� �� ������ �ִ��� Ȯ���ϴ� ��
			{
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();

		} catch (FileNotFoundException e) {
			// ��ȣ ������ ��Ÿ���� �� �̵��ϴ� ���
			System.out.print("�ҷ����� ���߿� ������ �߻��Ͽ����ϴ�");
		}
		
		

	}

}