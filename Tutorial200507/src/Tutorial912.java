//	�ݺ��Լ��� �Ǻ���ġ ���� ���ϱ�
public class Tutorial912 {
//	�Ǻ���ġ = ������ �� ���ڸ� ����ؼ� ���� ������ ��
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1)
		{
			return one;
		}
		else if(number == 2)
		{
			return two;
		}
		else
		{
			for(int i = 2; i < number; i++)
			{
				result = one + two;
				one = two;
				two = result;
				
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("�Ǻ���ġ �� 10��° ������" + fibonacci(31) + "�Դϴ�.");

	}

}
