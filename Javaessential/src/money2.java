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
		System.out.println("���� ������ �˷��� �׼��� �Է��ϼ���");
		int money = sc.nextInt();
		aa = money%50000;
		a = money/50000;
		bb = aa%10000;
		b = aa/10000;
		cc = bb%5000;
		c = bb/5000;
		d = cc/1000;
		System.out.println("5������ : " + a + "��");
		System.out.println("1������ : " + b + "��");
		System.out.println("5õ���� : " + c + "��");
		System.out.println("1õ���� : " + d + "��");
		
			System.out.println();
			sc.close();
		}
	}