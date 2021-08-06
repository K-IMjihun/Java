import java.util.Scanner;

public class melon {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("----Melon----");
		System.out.println("1. 회원가입           ");
		System.out.println("2. 로그인              ");
		System.out.println("3. 노래듣기           ");  
		System.out.println("4. 아이디찾기        ");
		System.out.println("5. 비밀번호찾기     ");
		System.out.println("-------------");
		int number = sc.nextInt();
		Privacy[] z = new Privacy[100];
		switch(number) {
			case 1 : {
				if(a < 100) {
					System.out.println("-------회원가입------");
					System.out.println("사용하실 ID를 입력해주세요.");
					String ID1 = sc.next();
					System.out.println("사용하실 패스워드를 입력하세요.");
					String PW = sc.next();
					if(a > 0) {
						System.out.println("ID 중복확인중...");
						for(int i = 0; i < a; i++) {
							if(z[i].getID().equals(ID1)) {
								System.out.println("오류 : 사용중인 아이디 입니다.");
								break;
							}
							else {
								z[a] = new Privacy(ID1, PW);
								System.out.println("아이디가 생성되었습니다:).");
								System.out.println("로그인 하여 이용해 주십시오.");
								break;
							
							}
					}			
			
				}
					else {  //처음 개설할 시에는 바로 등록된다.
						z[a] = new Privacy(ID1, PW);
						a++;
						System.out.println("아이디가 생성되었습니다:)");
						System.out.println("로그인 하여 이용해 주십시오.\n");
						break;
		
			}	
		}
	}
	}
	}
}

