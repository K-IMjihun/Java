//	���� ĳ���͵��� �̵� �� ��ġ�� ���� �����
//	�ڹ��� ��ä������ ���ȼ� ���� ������ �ٸ� Ŭ������ �ʿ��ϴ�.
//	Node = 2���� �������� ��ǥ�� �ǹ�
/*Get�� �����͸� ������
Set�� �����͸� �Է���
return�� �Լ� ���� ��ȯ*/
public class Node {

	private int x;
	private int y;
//	private�� �ܺο��� �ѹ��� ���� �� �� ���� (�ܺο��� �ٲ� �� ������ �ϱ�����)
	
	public int getX() {
//	�ܺ��� ������ ����ϱ� ���� public ���
		return x;
//	x�� ���� ��ȯ
	}
	
	public void setX(int x) {
//	x�� ���� ������
		this.x = x;
//		this.x = private int x��
//		���� ������ int x�� �ٲ� �ְڴٴ� �ǹ�
		}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;	
	}
	public Node(int x, int y) {
//	������ = ��ü�� ���� ��, �ڵ����� ���� �ʱ�ȭ �ð��ߴ� �Լ�.
//	Ŭ������ ������ �̸��� �������ִ�
		this.x = x;
		this.y = y;
		
	}
	
	public Node getCenter(Node other) {
//	getCenter(Node other) �ٸ� Node�� ��ǥ�� �޴´�
//	�ڽ��� ���� x,y ��ǥ�� �ٸ� Node�� x,y ��ǥ�� ���� ���߾��� ������ �ְ���
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
		
	}
	
	}

