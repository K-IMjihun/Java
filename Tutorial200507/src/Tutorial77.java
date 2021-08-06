import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tutorial77 {

	public static void main(String[] args) {
	
		File file = new File("input.txt");
//		input.txt를 읽어서 file 변수가 처리할 수 있도록 함
		try {
//		try, catch문 
//		프로그램이 존재하지 않을 때 필수적으로 사용자가 지정 해 주어야함
			Scanner sc = new Scanner(file);
//			콘솔창이 아니라 file에서 입력을 받기때문에 매개변수로 넣어줌
			while(sc.hasNextInt())
//				sc가 다음으로 읽어 올 정수가 있는지 확인하는 것
			{
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();

		} catch (FileNotFoundException e) {
			// 괄호 구문이 나타났을 때 이동하는 경로
			System.out.print("불러오는 도중에 오류가 발생하였습니다");
		}
		
		

	}

}