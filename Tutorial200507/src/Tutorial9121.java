//	재귀함수로 피보나치 수열 구하는법
//	재귀함수는 코드는 간단해지지만 비효율적.
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
//			피보나치의 한칸 전의 값 + 두칸 전의 값
			
		}
	}

	public static void main(String[] args) {

		System.out.println("피보나치 수열의 10번쨰 값은" + fibonacci(3) + "입니다.");

	}

}
