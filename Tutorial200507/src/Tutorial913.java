//	배열 = 데이터가 많을 때 사용
//	int[] array = new int[100]  =  기본적인 배열의 형태
//	[] = 배열이라는 것을 알림,  [100]  =  배열의 크기
//	배열은 0부터 출발

import java.util.Scanner;

public class Tutorial913 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 :");
		int number = sc. nextInt();
//		사용자가 입력하는 정수를 넣음
		int[] array = new int [number];
//		들어온 정수를 배열로 변환
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 :");
			array[i] = sc.nextInt();
			}
		int result = -1;
//		맨 처음 값은 -1로 설정함
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
//			가장 큰 값을 찾는 식, result(-1)와 array의 값을 비교하여 더욱 큰 값이 담기게 된다
		}
		System.out.print("배열에 입력한 정수 중 가장 큰 값은" + result + "입니다.");
	
		sc.close();
	}

}
