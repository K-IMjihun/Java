import java.util.Scanner;

public class Tutorial17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까 ? ");
		int number = scan.nextInt();
		Student[] students = new Student[number];
//		객체배열(다른 클래스를 배열 시킴) 
		for(int i = 0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("학생의 이름을 넣어주세요");
			name = scan.next();
			System.out.print("학생의 나이를 넣어주세요");
			age = scan.nextInt();
			System.out.print("학생의 키를 넣어주세요");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 넣어주세요");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 넣어주세요");
			studentID = scan.next();
			System.out.print("학생의  학년을 주세요");
			grade = scan.nextInt();
			System.out.print("학생의학점을 넣어주세요");
			gPA = scan.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
//			이게 위에꺼 값을 전부 넣는것
		}
		for(int i = 0; i < number; i++)
		{
			students[i].show();
		}
		
	}
		

}


