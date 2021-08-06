//	인터페이스는 추상 메소드보다 더욱 추상적이다.(미리 구현불가 설계만 가능)
//	숙련된 개발자들이 더욱 선호. 다중상속 가능
//	반드시 추상메소드와 준비된 상수만 가질 수 있다.
public class Tutorial20 implements dog, cat {
//	extends와 같은 뜻이나 인터페이스에선 implements를 사용
	public static void main(String[] args) {
		
		Tutorial20 main = new Tutorial20();
		main.crying();
		main.one();
		main.two();

	}

	public void crying() {

		System.out.println("왈! 왈!");
		
	}

	@Override
	public void one() {
		
		System.out.println("ㅎㅇ");
		
	}

	@Override
	public void two() {
		
		System.out.println("ㅂㅂ");
		
	}




}
