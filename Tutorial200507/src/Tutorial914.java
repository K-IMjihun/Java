//	�������迭 = �迭�� �迭�� ���ҷ� ��. ���� 2�����迭�� ���̻��
//	2��for���� 2�� ����ϴ� ������ �ѹ��� ��������� ���ٲް� ��ٲ��� ���� �� �� ����.
public class Tutorial914 {

	public static void main(String[] args) {

		int N = 50;
//		N = ��� ���� ����
		int[][] array = new int[N][N];
//		[][] = 2���� �迭 ����� ����
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
