//	�ݺ��Լ��� ����Լ� = ȿ�������� �ݺ��ϴ� ��
public class Tutorial911 {
//	5!  5*4*3*2*1
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum *= i;
		}
		return sum;
//		sum ���� ��ȯ(����)
	}

	public static void main(String[] args) {

		System.out.println("10���丮���� " + factorial(10) + "�Դϴ�");

	}

}
