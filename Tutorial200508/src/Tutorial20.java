//	�������̽��� �߻� �޼ҵ庸�� ���� �߻����̴�.(�̸� �����Ұ� ���踸 ����)
//	���õ� �����ڵ��� ���� ��ȣ. ���߻�� ����
//	�ݵ�� �߻�޼ҵ�� �غ�� ����� ���� �� �ִ�.
public class Tutorial20 implements dog, cat {
//	extends�� ���� ���̳� �������̽����� implements�� ���
	public static void main(String[] args) {
		
		Tutorial20 main = new Tutorial20();
		main.crying();
		main.one();
		main.two();

	}

	public void crying() {

		System.out.println("��! ��!");
		
	}

	@Override
	public void one() {
		
		System.out.println("����");
		
	}

	@Override
	public void two() {
		
		System.out.println("����");
		
	}




}
