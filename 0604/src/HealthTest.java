
import java.util.*;

public class HealthTest {

   public static void main(String[] args) {
      boolean isStop = false;
      Scanner sc = new Scanner(System.in);
      ArrayList<Person> memberList = new ArrayList<Person>(); 
      do {
         System.out.println("***HealthCare ȸ���������� ���α׷�(ver3)***");
         System.out.println(" ���� �޴��� �ϳ��� �Է��ϼ��� ");
         System.out.println(" 1. ȸ������ ");
         System.out.println(" 2. ȸ������ ���� ");
         System.out.println(" 3. ȸ������ ���� ");
         System.out.println(" 4. ȸ����� (��ü) ");
         System.out.println(" 9. ���α׷� ���� ");
         String command = sc.next();
      
         switch(command) {
         case"1":  //ȸ������
         {
        	System.out.println("*** ȸ������ ��� ****");
        	System.out.print("��   ��  : ");  String name = sc.next();
        	System.out.println("1. ȸ����� \n2. ��ȸ�����");
        	int memtype = sc.nextInt();
        	switch(memtype) {
        			case 1:{ //ȸ�����
        				System.out.print("ȸ����ȣ  :  ");  String id = sc.next();
        	            System.out.print("������(kg) :  ");  double w = sc.nextDouble();
        	            System.out.print("Ű   (cm)  :  ");  double h  = sc.nextDouble();
        	            memberList.add(new Member(name, id, w, h));
        			}break;
        			
        			case 2:{ //��ȸ�����
        				System.out.println("ȸ�� : "); long m = sc.nextLong();
        				memberList.add(new Customer(name, m));
        			}break;
        	}
			System.out.println("��ϵǾ����ϴ�...\n");
         }break;
         
         case"2":  //ȸ������ ����
         {
            System.out.println("< ȸ������ ���� >");
            System.out.print("������ ȸ���� �̸� : "); String name = sc.next();
            
            for(Person p : memberList) {
            	if(!(p instanceof Member)) continue;
            	Member m = (Member) p; //�ٿ�ĳ����
            	if(name.equals(m.getName())) {
            		System.out.println("ID : "+ m.getId() + " => ");
            		m.setId(sc.next());
            		
            		System.out.println("Ű(cm) : "+ m.getHeight() + " => ");
            		m.setHeight(sc.nextDouble());
            		
            		System.out.println("������(kg) : "+ m.getWeight() + " => ");
            		m.setWeight(sc.nextDouble());
            	}
            		break;
            } 
         }break;
         
         case"3":  //ȸ������ ����
         {
        	 int result = 1;
        	 System.out.println("< ȸ������ ���� >");
             System.out.print("������ ȸ���� �̸� : "); String name = sc.next();
             
             for(Person p : memberList) {
             	if(name.equals(p.getName())) {
             		memberList.remove(p);
             		System.out.println("�����Ǿ����ϴ�...\n");
             		
             		result=0;
             		break;
             	}
             }
             if(result == 1) System.out.println("ã�� ȸ���� �����ϴ�.");
         }break;
         
         case"4":  //ȸ�����(��ü)
         {
            System.out.println(" *** ��ü ȸ����� ��ȸ *** ");
            for(Person p : memberList) {
               System.out.println(p);
            }
            
         }break;
         
         case"9":  //���α׷� ����
         {
            System.out.println("���α׷��� �����մϴ�...");
            isStop = true;
            
         }break;
         }
         
      }while(!isStop);

   }

}