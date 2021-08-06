//	상속 = 다른 클래스의 정보를 상속받아 상황에따라 불필요한 코드를 줄일 수 있다.
public class Tutorial916 {

	public static void main(String[] args) {
			
		Student student1 = new Student("김지훈",  20, 176, 70, "20140101", 1, 4.5);
		Student student2 = new Student("정민수 ",  20, 176, 70, "20140121", 1, 4.5);
		student1.show();
		student2.show();
	}

}
