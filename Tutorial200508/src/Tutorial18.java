//	추상 = 설계적인 부분(미완성클래스), 꼮 상속받아야 하며 구현해주어야 하며
//	정확히 어떤 메소드를 구현하여야 하는 지 알 수 있다.
public class Tutorial18 extends player {

	public static void main(String[] args) {
		
		Tutorial18 main = new Tutorial18();
//		static으로 선언되지 않으면 불러올 수 없으므로 인스턴스를 만듦
		main.play("벡예린 - square");
		main.pause();
		main.stop();

	}

	@Override
	void play(String songName) {

		System.out.println(songName + " 곡을 재생합니다.");
		
	}

	@Override
	void pause() {

		System.out.println("곡을 일시정지합니다.");
		
	}

	@Override
	void stop() {

		System.out.println("곡을 정지합니다.");
		
	}

}
