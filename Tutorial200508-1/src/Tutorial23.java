
public class Tutorial23 {

	public static void main(String[] args) {

		Hero[] heros = new Hero[3];
//		Hero�� �θ�Ŭ�������� �ڽ�Ŭ�������� �ν��Ͻ� �ʱ�ȭ
		heros[0] = new Warrior("����");
		heros[1] = new Archer("�ü�");
		heros[2] = new Magition("������");
		
		for(int i = 0; i< heros.length; i++) {
//		length = �迭, 0~2���� �����ϰڴٴ� ��
			heros[i].attack();
		
			if(heros[i] instanceof Warrior) {
//		instanceof = ��üŸ�� Ȯ�ο� ���, ������ ������ �����
//		�ַ� �θ�ü(Hero)���� �ڽİ�ü(Warrior)���� Ȯ���Ҷ� ��
				Warrior temp = (Warrior) heros[i];
				temp.powerstrike();
			}
			else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.firearrow();
			}
			else if(heros[i] instanceof Magition) {
				Magition temp = (Magition) heros[i];
				temp.freezing();
			}
		}
		
	}

}
