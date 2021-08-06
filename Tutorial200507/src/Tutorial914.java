//	다차원배열 = 배열이 배열의 원소로 들어감. 흔히 2차원배열을 많이사용
//	2중for문을 2번 사용하는 이유는 한번만 사용했을시 열바꿈과 행바꿈을 같이 할 수 없다.
public class Tutorial914 {

	public static void main(String[] args) {

		int N = 50;
//		N = 행과 열의 길이
		int[][] array = new int[N][N];
//		[][] = 2차원 배열 만드는 공식
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
