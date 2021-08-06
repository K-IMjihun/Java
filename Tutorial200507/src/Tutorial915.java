//	클래스. 본격적인 객체지향을 공부, 객체 = 실세계의 사물
public class Tutorial915 {

	public static void main(String[] args) {
	
		Node one = new Node(10, 20);
		Node two = new Node(20, 30);
		Node result = one.getCenter(two);
//		one 좌표를 받아 다른 two의 좌표를 비교해 정중앙 값을 받아 result에 담음
		System.out.println("x : " + result.getX() + ", y : " + result.getY());
		
		
		
	}

}
