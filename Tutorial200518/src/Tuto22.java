
public class Tuto22 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		while(a<5) {
			while(b<5) {
				System.out.print(" ");
				b++;
			}
			b=0;
			
			int c = 5;
			while(c > a) {
				System.out.print(" ");
				c--;
			}
			int d = 0;
			while(d< 2*a+1) {
				System.out.print("*");
				d++;
			}
			System.out.println();
			a++;
		}
		int e = 0;
		int f = 0;
		while(e<5) {
			while(f<e) {
				System.out.print(" ");
				f++;
			}
			int g = 5;
			while(g > e) {
				System.out.print("*");
				g--;
			}
			int h = 16;
			while(h>e) {
				System.out.print("*");
				h--;
			}
			
		g = 5;
			System.out.println();
			e++;
			f=0;
		}
		int i = 0;
		int j = 4;
		while(i < 5) {
			while(j > i) {
				System.out.print(" ");
				j--;
			}
			int k = 7;
			while(k > 2*i+1) {
				System.out.print("*");
				k--;
			}
			int l = 0;
			while(l<i*6+1) {
				System.out.print(" ");
				l++;
			}
			int o = 7;
			while(o > 2*i+1) {
				System.out.print("*");
				o--;
			}
			System.out.println();
			i++;
			j=4;
		}
	}

}