//	��ü(object)Ŭ���� = ��� ��ü�� ����
// extends object�� ���� �ʴ��� ��� Ŭ������ ���� �� �ִ�
public class Tutorial22 {

	public static void main(String[] args) {

		Archer archer1 = new Archer("�ü�1", "��");
		Archer archer2 = new Archer("�ü�1", "��");
		System.out.println(archer1 == archer2);
//	�� ĳ������ ���� ���Ƶ� �ϳ��� ĳ���Ͱ� �ƴϴ�
		System.out.println(archer1.equals(archer2));
//	�� ĳ������ ���� ����
	}

}
