//	반복함수와 재귀함수 = 효율적으로 반복하는 것
public class Tutorial911 {
//	5!  5*4*3*2*1
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum *= i;
		}
		return sum;
//		sum 값을 반환(도출)
	}

	public static void main(String[] args) {

		System.out.println("10팩토리얼은 " + factorial(10) + "입니다");

	}

}
