public class Tutorial9131 {

	public static void main(String[] args) {

		int[] array = new int[100];
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
//	Math.random = 0=< x < 1     ������ ���� �Ǽ����� ����
//	*100 +1�� �ϸ� 1~100�� ���� �����ϰ� ����
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("100���� ���� ������ ��� ����" + sum / 100 + "�Դϴ�.");

	}

}
