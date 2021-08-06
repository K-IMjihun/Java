import java.util.Scanner;

class Phone	{
		String name;
		String tel;
		public Phone(String name, String tel) {
			this.name = name;
			this.tel = tel;
		}
		public String getName() {return name;}
		public String getTel() {return tel;}
		
		}

public class PhoneManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 >> ");
		int persons = sc.nextInt();
		Phone[] person = new Phone[persons];
		for(int i = 0; i < persons; i++) {
			System.out.println(" 이용자의 이름과 번호를 연속으로 입력 : ");
			person[i] = new Phone(sc.next() , sc.next()); }
	System.out.println("저장되었습니다.");
	label : while(true) {
		System.out.println("검색 할 이름 : ");
		String SN = sc.next();
		for(int i = 0; i < persons; i++) {
		if(SN.equals("exit")) {
		 break label ;
			}
		else if(SN.equals(person[i].getName())) {
			System.out.println(person[i].getName() + " 의 번호는 " + person[i].getTel());
		}
		else if (!SN.equals(person.clone()[i].getName()) && i == (persons - 1)) {
			System.out.println("등록안됨");
			break;
			
		}
		}
		System.out.println("시스템을 종료");
		sc.close();
	}
	}
}