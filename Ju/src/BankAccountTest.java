import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		boolean isStop = false;
		int c=0; //몇 개의 계좌를 개설했는지 카운트함
		Scanner sc = new Scanner(System.in);
		BankAccount [] b1 = new BankAccount[100]; //객체 배열 만들기
		do {
			System.out.println("===계좌괸리 프로그램===");
			System.out.println("*   1. 계좌개설        *");
			System.out.println("*   2. 입금하기        *");
			System.out.println("*   3. 출금하기        *");
			System.out.println("*   4. 잔액조회        *");  //계좌번호를 입력하면 현재 잔액을 알려줌
			System.out.println("*   5. 계좌조회        *");  //이름을 입력하면 해당 계좌 번호를 알려줌
			System.out.println("*   9. 종료하기        *");
			System.out.println("=================");
			System.out.print("  메뉴를 선택하세요 >>> ");
			String command = sc.next();
			switch(command) {
				case "1":{
					if(c<100) {
						System.out.println("   < 계좌개설  >");
						System.out.print("계좌번호 : "); String accNumber = sc.next();
						System.out.print("예금주 : "); String accOwner = sc.next();
						System.out.print("잔액 : "); int money = sc.nextInt();
						if(c>0) { //처음 개설이 아닐 시 계좌번호를 확인하여 계좌번호 중복을 없앤다.
							System.out.println("계좌번호 확인중...");
							for(int i=0;i<c;i++) {
							if(b1[i].getAccountNumber().equals(accNumber)) { //입력한 번호가 이미 있다면
								System.out.println("개설 실패 : 계좌번호 중복입니다.\n"); //등록되지않고 실패
								break;
							}
							else if(i==c-1) {  //중복되지 않았다면 등록
								b1[c] = new BankAccount(accNumber, accOwner);
								b1[c].setBalance(money);
								c++;
								System.out.println("등록되었습니다.\n");
								break;
							}	
							}
						}
						else {  //처음 개설할 시에는 바로 등록된다.
							b1[c] = new BankAccount(accNumber, accOwner);
							b1[c].setBalance(money);
							c++;
							System.out.println("등록되었습니다.\n");
						}
					
						System.out.println("**정보 조회 **");  //등록된 계좌번호 전체 조회
						System.out.println("===============================================");
						System.out.print("   번호                 계좌번호");
						System.out.print("\t            예금주            현재잔액\n");
						for (int i = 0; i < c; i++) {
							if(b1[i] != null){
								System.out.printf("%3d %13s",i+1,b1[i].getAccountNumber());
								System.out.printf("%16s %10d\n",b1[i].getOwner(),b1[i].getBalance());
			                }
			            }
						System.out.println("===============================================\n");					
					}
					else //등록 가능한 범위(100)을 넘게되면 실패
						System.out.println("개설 범위를 초과하였습니다...\n");
				}break;
				
				case "2":{
					System.out.println("**입금 하기 **");  //등록된 계좌번호 전체 조회
					System.out.print("계좌번호 : "); String accNumber =sc.next();
					for(int i=0;i<b1.length;i++) {  //b1배열 전체 조사하기
						try {
								if(accNumber.equals(b1[i].getAccountNumber())) {  //입력한 계좌번호로 등록된 계좌번호 찾기
								System.out.print("입금액 : "); int amount = sc.nextInt();
								b1[i].deposit(amount);  //입금하기
								System.out.println("현재 잔액은 "+b1[i].getBalance()+"입니다.\n");
								break;
								}
						}catch(NullPointerException e) {  //없는 계좌번호를 입력할 시 예외처리
								System.out.println("일치하는 계좌 번호가 없습니다.\n");
								break;
						}
					}
				}break;
				
				case "3":{
					System.out.println("**출금 하기 **");  //등록된 계좌번호 전체 조회
					System.out.print("계좌번호 : "); String accNumber = sc.next();
					for(int i=0;i<b1.length;i++) {
						try {
							if(accNumber.equals(b1[i].getAccountNumber())) {
								System.out.println("< 출금하기 >");
								System.out.print("출금액 : "); int amount = sc.nextInt();
								b1[i].withdraw(amount); //출금하기
								System.out.println("현재 잔액은 "+b1[i].getBalance()+"입니다.\n");
								break;
							}
						}catch(NullPointerException e) {  //없는 계좌번호를 입력할 시 예외처리
								System.out.println("일치하는 계좌 번호가 없습니다.\n");
								break;
						}
					}
				}break;
				
				case "4":{
					System.out.println("**잔액 조회 **");  //등록된 계좌번호 전체 조회
					System.out.print("계좌번호 : "); String accNumber = sc.next();
					for(int i=0;i<b1.length;i++) {
						try {
							if(accNumber.equals(b1[i].getAccountNumber())) {
							System.out.println("현재 잔액은 "+b1[i].getBalance()+"입니다.\n");
							break;
							}
						}catch(NullPointerException e) {
								System.out.println("계좌가 없습니다.\n");
								break;
						}
					}	
				}break;
				
				case "5":{
					System.out.println("**계좌 조회 **");  //이름을 입력하여 해당 이름으로 등록된 계좌번호 조회
					System.out.print("이름 : "); String accOwner = sc.next();
					for(int i=0;i<b1.length;i++) {
						try {
							if(accOwner.equals(b1[i].getOwner())) {  //입력한 이름으로 등록된 이름 찾기
							System.out.println(accOwner+"님의 계좌 번호는 "+b1[i].getAccountNumber()+"입니다.\n");
							break;  //해당 계좌번호를 알려줌
							}
						}catch(NullPointerException e) {  //없는 이름을 입력할 시 예외처리
								System.out.println("등록된 이름이 없습니다.\n");
								break;
						}
					}	
				}break;
				
				case "9": //종료하기 선택
					System.out.println("계좌관리 프로그램 종료 중...");
					isStop = true;
					System.out.println("계좌관리 프로그램 종료되었습니다.");
					break;
				
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}while(!isStop);
	}

}
