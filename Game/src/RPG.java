import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("세기말에 오신것을 환영합니다. 캐릭터를 골라주세요.");
		System.out.println("1. 주현준 공격력:5 ");
		System.out.println("2. 정민수");
		System.out.println("3. 안지훈");
		int number = sc.nextInt();
		if(number == 1) {
			System.out.println("'주현준'님을 선책 하였습니다.");
		}
	}

}