//	����Լ��� �Ǻ���ġ ���� ���ϴ¹�
//	����Լ��� �ڵ�� ������������ ��ȿ����.
public class Tutorial9121 {
	
	public static int fibonacci(int number) {
		if(number == 1)
		{
			return 1;
			
		}
		else if(number == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci(number - 1) + fibonacci(number - 2);
//			�Ǻ���ġ�� ��ĭ ���� �� + ��ĭ ���� ��
			
		}
	}

	public static void main(String[] args) {

		System.out.println("�Ǻ���ġ ������ 10���� ����" + fibonacci(3) + "�Դϴ�.");

	}

}
