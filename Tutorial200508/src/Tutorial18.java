//	�߻� = �������� �κ�(�̿ϼ�Ŭ����), �� ��ӹ޾ƾ� �ϸ� �������־�� �ϸ�
//	��Ȯ�� � �޼ҵ带 �����Ͽ��� �ϴ� �� �� �� �ִ�.
public class Tutorial18 extends player {

	public static void main(String[] args) {
		
		Tutorial18 main = new Tutorial18();
//		static���� ������� ������ �ҷ��� �� �����Ƿ� �ν��Ͻ��� ����
		main.play("������ - square");
		main.pause();
		main.stop();

	}

	@Override
	void play(String songName) {

		System.out.println(songName + " ���� ����մϴ�.");
		
	}

	@Override
	void pause() {

		System.out.println("���� �Ͻ������մϴ�.");
		
	}

	@Override
	void stop() {

		System.out.println("���� �����մϴ�.");
		
	}

}
