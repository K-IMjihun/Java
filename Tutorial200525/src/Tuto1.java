//배열 = 정보를 그루핑하는것.색인을 부여해 특정한 정보를 불러 올 수 있다.
public class Tuto1 {

	public static void main(String[] args) {
//								원소, element
		String[] classGroup = {"민수", "현준","지훈"};
//		classGroup이라는 변수에는 
//		(String[])문자열의 데이터로 구성 되어 있는 배열이 담긴다.
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
//		[0],[1],[2] = index(색인) 이라고 부른다.
		

		
//		 - length는 배열의 길이를 알고자 할때 사용된다.
		String[] classgroup = new String[3];
		classgroup[0] = "민수";
		System.out.println(classgroup.length);
		classgroup[1] = "현준";
		System.out.println(classgroup.length);
		classgroup[2] = "지훈";
		System.out.println(classgroup.length);
				
	}

	

}

