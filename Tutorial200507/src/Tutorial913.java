//	�迭 = �����Ͱ� ���� �� ���
//	int[] array = new int[100]  =  �⺻���� �迭�� ����
//	[] = �迭�̶�� ���� �˸�,  [100]  =  �迭�� ũ��
//	�迭�� 0���� ���

import java.util.Scanner;

public class Tutorial913 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ��� :");
		int number = sc. nextInt();
//		����ڰ� �Է��ϴ� ������ ����
		int[] array = new int [number];
//		���� ������ �迭�� ��ȯ
		for(int i = 0; i < number; i++)
		{
			System.out.print("�迭�� �Է��� ������ �ϳ��� �Է��ϼ��� :");
			array[i] = sc.nextInt();
			}
		int result = -1;
//		�� ó�� ���� -1�� ������
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
//			���� ū ���� ã�� ��, result(-1)�� array�� ���� ���Ͽ� ���� ū ���� ���� �ȴ�
		}
		System.out.print("�迭�� �Է��� ���� �� ���� ū ����" + result + "�Դϴ�.");
	
		sc.close();
	}

}
