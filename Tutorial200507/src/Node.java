//	게임 캐릭터들의 이동 및 위치에 많이 사용함
//	자바의 객채지향은 보안성 문제 때문에 다른 클래스가 필요하다.
//	Node = 2차원 공간에서 좌표를 의미
/*Get은 데이터를 뺴내옴
Set은 데이터를 입력함
return은 함수 값을 반환*/
public class Node {

	private int x;
	private int y;
//	private는 외부에서 한번에 접근 할 수 없음 (외부에서 바꿀 수 없도록 하기위함)
	
	public int getX() {
//	외부의 접근을 허용하기 위해 public 사용
		return x;
//	x의 값을 반환
	}
	
	public void setX(int x) {
//	x의 값을 설정함
		this.x = x;
//		this.x = private int x를
//		지금 들어오는 int x로 바꿔 주겠다는 의미
		}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;	
	}
	public Node(int x, int y) {
//	생성자 = 객체를 만들 때, 자동으로 값을 초기화 시겨추는 함수.
//	클래스랑 동일한 이름을 가지고있다
		this.x = x;
		this.y = y;
		
	}
	
	public Node getCenter(Node other) {
//	getCenter(Node other) 다른 Node의 좌표룰 받는다
//	자신이 가진 x,y 좌표와 다른 Node의 x,y 좌표를 비교해 정중앙을 가질수 있게함
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
		
	}
	
	}

