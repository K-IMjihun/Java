//	��ü���� : ��ü�� ���� ������ �ǹ�. java���� '�����͸� �ٷ�� ����'���� ���δ�
//	�ִ� ����� ����¹�
//  �޼ҵ� = �Լ�
public class Tutorial9 {
//	function   =  ����� ���� �Լ�
//	       	            ��ȯ��	�Լ���	        �Ű�����  
	public static int function(int a, int b, int c) {
		int min;
//	 min = ����������
		if(a > b)
		{
			if(b > c)
			{
				min = c;
			}
			else
			{
				min = b;
			}
		}
		else
		{
			if(a > c)
			{
				min = c;
			}
			else
			{
				min = a;
				
			}
		}
		for(int i = min; i > 0; i--)
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("300, 400, 500 �� �ִ� ������� " + function(300, 400, 500) + "�Դϴ�." );
		
	}
}
