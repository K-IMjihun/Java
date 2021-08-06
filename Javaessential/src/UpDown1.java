import java.util.Random;
import java.util.Scanner;

public class UpDown1 {

	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100);
		System.out.println("Up&Down 게임입니다 !");
		System.out.println("0과 99의 정수중에서 입력해주세요 .");
		Scanner sc= new Scanner(System.in);
		int count = 1;
		
		while(true) {	//while을 무한루프로 만든다. 
			int number = sc.nextInt();

			if(number != k && number < k) {
				System.out.println("Up");
				count ++;
			}
			else if (number != k && number > k) {
				System.out.println("Down");
				count ++;
			}
			else if (number == k) {
				System.out.println("정답입니다 !");
				System.out.println(count + " 번만에 맞주셨습니다");
				System.exit(0);
				sc.close();
			}
		}


	}

}
