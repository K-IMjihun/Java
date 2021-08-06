import java.util.Scanner;

public class money2 {

	public static void main(String[] args) {
	int a;
	int b;
	int c;
	int d;
	int aa;
	int bb;
	int cc;

	
		Scanner sc = new Scanner(System.in);
		System.out.println("지폐 갯수를 알려줌 액수를 입력하세요");
		int money = sc.nextInt();
		aa = money%50000;
		a = money/50000;
		bb = aa%10000;
		b = aa/10000;
		cc = bb%5000;
		c = bb/5000;
		d = cc/1000;
		System.out.println("5만원권 : " + a + "매");
		System.out.println("1만원권 : " + b + "매");
		System.out.println("5천원권 : " + c + "매");
		System.out.println("1천원권 : " + d + "매");
		
			System.out.println();
			sc.close();
		}
	}