
import java.util.*;

public class HealthTest {

   public static void main(String[] args) {
      boolean isStop = false;
      Scanner sc = new Scanner(System.in);
      ArrayList<Person> memberList = new ArrayList<Person>(); 
      do {
         System.out.println("***HealthCare 회원정보관리 프로그램(ver3)***");
         System.out.println(" 다음 메뉴중 하나를 입력하세요 ");
         System.out.println(" 1. 회원가입 ");
         System.out.println(" 2. 회원정보 수정 ");
         System.out.println(" 3. 회원정보 삭제 ");
         System.out.println(" 4. 회원목록 (전체) ");
         System.out.println(" 9. 프로그램 종료 ");
         String command = sc.next();
      
         switch(command) {
         case"1":  //회원가입
         {
        	System.out.println("*** 회원정보 등록 ****");
        	System.out.print("이   름  : ");  String name = sc.next();
        	System.out.println("1. 회원등록 \n2. 비회원등록");
        	int memtype = sc.nextInt();
        	switch(memtype) {
        			case 1:{ //회원등록
        				System.out.print("회원번호  :  ");  String id = sc.next();
        	            System.out.print("몸무게(kg) :  ");  double w = sc.nextDouble();
        	            System.out.print("키   (cm)  :  ");  double h  = sc.nextDouble();
        	            memberList.add(new Member(name, id, w, h));
        			}break;
        			
        			case 2:{ //비회원등록
        				System.out.println("회비 : "); long m = sc.nextLong();
        				memberList.add(new Customer(name, m));
        			}break;
        	}
			System.out.println("등록되었습니다...\n");
         }break;
         
         case"2":  //회원정보 수정
         {
            System.out.println("< 회원정보 수정 >");
            System.out.print("수정할 회원의 이름 : "); String name = sc.next();
            
            for(Person p : memberList) {
            	if(!(p instanceof Member)) continue;
            	Member m = (Member) p; //다운캐스팅
            	if(name.equals(m.getName())) {
            		System.out.println("ID : "+ m.getId() + " => ");
            		m.setId(sc.next());
            		
            		System.out.println("키(cm) : "+ m.getHeight() + " => ");
            		m.setHeight(sc.nextDouble());
            		
            		System.out.println("몸무게(kg) : "+ m.getWeight() + " => ");
            		m.setWeight(sc.nextDouble());
            	}
            		break;
            } 
         }break;
         
         case"3":  //회원정보 삭제
         {
        	 int result = 1;
        	 System.out.println("< 회원정보 삭제 >");
             System.out.print("삭제할 회원의 이름 : "); String name = sc.next();
             
             for(Person p : memberList) {
             	if(name.equals(p.getName())) {
             		memberList.remove(p);
             		System.out.println("삭제되었습니다...\n");
             		
             		result=0;
             		break;
             	}
             }
             if(result == 1) System.out.println("찾는 회원이 없습니다.");
         }break;
         
         case"4":  //회원목록(전체)
         {
            System.out.println(" *** 전체 회원목록 조회 *** ");
            for(Person p : memberList) {
               System.out.println(p);
            }
            
         }break;
         
         case"9":  //프로그램 종료
         {
            System.out.println("프로그램을 종료합니다...");
            isStop = true;
            
         }break;
         }
         
      }while(!isStop);

   }

}