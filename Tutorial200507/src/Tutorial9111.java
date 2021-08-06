//	재귀함수 = 자기자신을 스스로 호출함
public class Tutorial9111 {
	
	public static int factorial(int number) {
		if(number == 1)
			return 1;
//		1이라면 1의 값을 반환
		else
			return number * factorial(number - 1);
//		!은 자신의 값 * 어떤 수 이기 때문에 이런 식으로 간단히 정의 가능
//		5! = 5*4!이기 때문에 재귀함수를 사용해 간단하게 값을 도출가능
	}

	public static void main(String[] args) {

		System.out.println("10팩토리얼의 값은" + factorial(10) + "입니다");
	}

}
