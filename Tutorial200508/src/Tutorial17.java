import java.util.Scanner;

public class Tutorial17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� �����մϱ� ? ");
		int number = scan.nextInt();
		Student[] students = new Student[number];
//		��ü�迭(�ٸ� Ŭ������ �迭 ��Ŵ) 
		for(int i = 0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("�л��� �̸��� �־��ּ���");
			name = scan.next();
			System.out.print("�л��� ���̸� �־��ּ���");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �־��ּ���");
			height = scan.nextInt();
			System.out.print("�л��� �����Ը� �־��ּ���");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �־��ּ���");
			studentID = scan.next();
			System.out.print("�л���  �г��� �ּ���");
			grade = scan.nextInt();
			System.out.print("�л��������� �־��ּ���");
			gPA = scan.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
//			�̰� ������ ���� ���� �ִ°�
		}
		for(int i = 0; i < number; i++)
		{
			students[i].show();
		}
		
	}
		

}


