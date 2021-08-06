import java.util.Scanner;

public class Arte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 음료를 주문하시겠습니까?");
		System.out.println("-----메뉴판-----");
		System.out.println("에스프레소 : 2,000");
		System.out.println("아메리카노 : 2,500");
		System.out.println("카푸치노 : 3,000");
		System.out.println("카페라떼 : 3,500");
		String coffee = sc.next();
		int number = sc.nextInt();
		if(coffee == 에스프레소) {
			System.out.println(2000*number + "원입니다");}
		else if(coffee == 아메리카노){
			System.out.println(2500*number + "원입니다");}
		else if(coffee == 카푸치노){
			System.out.println(3000*number + "원입니다");}
		else if(coffee == 카페라떼){
			System.out.println(3500*number + "원입니다");}	
	}
}
