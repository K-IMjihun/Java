import java.util.Scanner;

class player{
		private String name;
		
		public player(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
}
public class gambling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		player [] p = new player[2];
		for(int i = 0; i < p.length; i ++) {
			System.out.print("�����̸� �Է� >>");
			p[i] = new player(sc.next());
		}
		
		int n = 0;
		while(true) {
			System.out.print(p[n].getName() + "�� <�ƹ��ų� �Է� ���ּ���>");
					sc.next();
					int [] val = new int [3];
					for(int i = 0; i < val.length; i++) {
						val[i] = (int)(Math.random()*3);
						System.out.print(val[i] + "\t");
					}
					if(val[0] == val[1] && val[1] == val[2]) {
						System.out.print(p[n].getName() + "���� �̰���ϴ�");
						break;
					}
					n++;
					n = n%2;
		}
		sc.close();
	}
}
