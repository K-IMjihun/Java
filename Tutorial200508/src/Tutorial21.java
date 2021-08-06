//	다형성 = 부모 클래스의 변수로 하위 클래스 창조가능
import java.util.Scanner;

public class Tutorial21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("바나나 : 1, 금귤 : 2 ");
		int input = scanner.nextInt();
//		사용자가 설정한 과일을 받아옴
		Fruit fruit;
		if(input == 1) {
			fruit = new banana();
			fruit.show();
			
		}
		else if (input == 2) {
			fruit = new Kinkan();
			fruit.show();
		}
		

	}

}
