

public class asd {

	public static void main(String[] args) {
		
		//윗부분
		int i=0;
		while(i<10) {
			int j=0;
			while(j<10-i) {
				System.out.print(" ");
				j++;
			}
			//별표 
			int k=0;
			while(k<2*i+1) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i++;
		}
		//아래부분 
		int l=9;
		while(l>=1) {
			//공백 
			int j=0;
			while(j<=10-l) {
				System.out.print(" ");
				j++;
			}
			//별표 
			int k=0;
			while(k<2*l-1) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
			l--;
		}
	}
}

