//  �ܾ ��ȯ�ϴ¹�
public class Tutorial910 {

	public static char function(String input) {
//		���ڿ��� ó���ؼ� ĳ���ͷ� ��ȯ�Ѵ�
		return input.charAt(input.length() -1);
//		String�� Ŭ������ �ۼ�, ���� �Լ��� ���� �� �ִ�
//		charAt�� ���ڿ��� ������ ���, char�� �ܾ �ǹ�
//		charAt(input.length()- 1) = ������ ���ڸ� ������
//		-1�� ������ �� ������ ������ �ϳ� ���ܵιǷ� �ۼ��Ͽ��� �Ѵ�.
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world�� ������ �ܾ��" + function("Hello world"));
		

	}

}
