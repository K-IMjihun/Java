
public class Tuto11 {

	public static void main(String[] args) {
	
		int i = 0;
		while(i < 10) {
			int j = 0;
			while(j <10-i) {
				System.out.print(" ");
				j++;
			}
			int k = 0;
			while(k<2*i+1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		int a =9;
		while(a <= 0) {
			int b = 0;
			while(b <=9) {
				System.out.print(" ");
				b++;
				}
			System.out.println();
			a--;
		}

		   }
}
