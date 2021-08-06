//  단어를 반환하는법
public class Tutorial910 {

	public static char function(String input) {
//		문자열을 처리해서 캐릭터로 반환한다
		return input.charAt(input.length() -1);
//		String은 클래스로 작성, 여러 함수를 가질 수 있다
//		charAt은 문자열을 뽑을때 사용, char는 단어를 의미
//		charAt(input.length()- 1) = 마지막 글자를 가져옴
//		-1은 저장할 시 마지막 공간을 하나 남겨두므로 작성하여야 한다.
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world의 마지막 단어는" + function("Hello world"));
		

	}

}
