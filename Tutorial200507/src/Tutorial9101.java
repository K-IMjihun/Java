
public class Tutorial9101 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
//		3항연산자, a>b라면 a의 값을, 아니면 b의 값을 넣는다
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a, b);
//		a와 b 값을 비교하여 큰 값을 result에 넣음
		result = max(result, c);
		return result;
//		result = 결과
		}

	public static void main(String[] args) {

		System.out.println("(345, 456, 789) 중에서 가장 큰 값은 " + function(345, 456, 789) + " 입니다.");

	}

}
