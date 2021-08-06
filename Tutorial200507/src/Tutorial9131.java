public class Tutorial9131 {

	public static void main(String[] args) {

		int[] array = new int[100];
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
//	Math.random = 0=< x < 1     사이의 랜덤 실수값이 나옴
//	*100 +1을 하면 1~100의 값이 랜덤하게 나옴
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은" + sum / 100 + "입니다.");

	}

}
