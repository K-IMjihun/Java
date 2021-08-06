
public class java {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 9-i; j++) // ÁÂÃø ºó°ø°£
			{
				System.out.print(" "); 
			}
			for(int j = 0; j < 2*i+1; j++)
			{
				System.out.print("*"); 
			}
			System.out.println("");
		}
	}
}
