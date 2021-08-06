//	객체지향 : 객체는 보통 물건을 의미. java에선 '데이터를 다루는 수법'으로 쓰인다
//	최대 공약수 만드는법
//  메소드 = 함수
public class Tutorial9 {
//	function   =  사용자 정의 함수
//	       	            반환명	함수명	        매개변수  
	public static int function(int a, int b, int c) {
		int min;
//	 min = 가장작은값
		if(a > b)
		{
			if(b > c)
			{
				min = c;
			}
			else
			{
				min = b;
			}
		}
		else
		{
			if(a > c)
			{
				min = c;
			}
			else
			{
				min = a;
				
			}
		}
		for(int i = min; i > 0; i--)
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("300, 400, 500 의 최대 공약수는 " + function(300, 400, 500) + "입니다." );
		
	}
}
