
public class Tutorial9101 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
//		3�׿�����, a>b��� a�� ����, �ƴϸ� b�� ���� �ִ´�
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a, b);
//		a�� b ���� ���Ͽ� ū ���� result�� ����
		result = max(result, c);
		return result;
//		result = ���
		}

	public static void main(String[] args) {

		System.out.println("(345, 456, 789) �߿��� ���� ū ���� " + function(345, 456, 789) + " �Դϴ�.");

	}

}
