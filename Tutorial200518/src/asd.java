

public class asd {

	public static void main(String[] args) {
		
		//���κ�
		int i=0;
		while(i<10) {
			int j=0;
			while(j<10-i) {
				System.out.print(" ");
				j++;
			}
			//��ǥ 
			int k=0;
			while(k<2*i+1) {
				System.out.print("*");
				k++;
			}
			System.out.println("");
			i++;
		}
		//�Ʒ��κ� 
		int l=9;
		while(l>=1) {
			//���� 
			int j=0;
			while(j<=10-l) {
				System.out.print(" ");
				j++;
			}
			//��ǥ 
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

