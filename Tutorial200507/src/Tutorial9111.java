//	����Լ� = �ڱ��ڽ��� ������ ȣ����
public class Tutorial9111 {
	
	public static int factorial(int number) {
		if(number == 1)
			return 1;
//		1�̶�� 1�� ���� ��ȯ
		else
			return number * factorial(number - 1);
//		!�� �ڽ��� �� * � �� �̱� ������ �̷� ������ ������ ���� ����
//		5! = 5*4!�̱� ������ ����Լ��� ����� �����ϰ� ���� ���Ⱑ��
	}

	public static void main(String[] args) {

		System.out.println("10���丮���� ����" + factorial(10) + "�Դϴ�");
	}

}
