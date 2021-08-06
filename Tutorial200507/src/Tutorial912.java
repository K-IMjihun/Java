//	반복함수로 피보나치 수열 구하기
public class Tutorial912 {
//	피보나치 = 이전의 두 숫자를 계속해서 더해 나가는 것
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

		System.out.println("피보나치 의 10번째 수열은" + fibonacci(31) + "입니다.");

	}

}
