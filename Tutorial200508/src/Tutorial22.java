//	객체(object)클래스 = 모는 객체의 조상
// extends object를 넣지 않더라도 모든 클래스에 적용 돼 있다
public class Tutorial22 {

	public static void main(String[] args) {

		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		System.out.println(archer1 == archer2);
//	두 캐릭터의 값이 같아도 하나의 캐릭터가 아니다
		System.out.println(archer1.equals(archer2));
//	두 캐릭터의 값이 같다
	}

}
