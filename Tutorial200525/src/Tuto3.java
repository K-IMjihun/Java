//	method, 메소드, 함수, function = 전부 같은걸 의미
//	메소드 정의와 호출
public class Tuto3 {
	
//	메소드의 정의(중괄호가 나타나면 정의
	public static void numbering() {
		int i = 0;
		while ( i < 10) {
			System.out.println(i);
			i++;
		}
	}
//					   main = 자바와 개발자의 약속 (이해가 아니고 외워야 함)
	public static void main(String[] args) {
	numbering();
//	호출(메소드의 정의를 호출), 중괄호 없이 끝나면 호출

	}

}
