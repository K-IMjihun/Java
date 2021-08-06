
public class Tutorial23 {

	public static void main(String[] args) {

		Hero[] heros = new Hero[3];
//		Hero는 부모클래스지만 자식클래스에서 인스턴스 초기화
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Magition("마법사");
		
		for(int i = 0; i< heros.length; i++) {
//		length = 배열, 0~2까지 실행하겠다는 뜻
			heros[i].attack();
		
			if(heros[i] instanceof Warrior) {
//		instanceof = 객체타입 확인에 사용, 전사라면 이쪽이 실행됨
//		주로 부모객체(Hero)인지 자식객체(Warrior)인지 확인할때 씀
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
