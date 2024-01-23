import java.util.Scanner;

public class Grade {
	int math;
	int science;
	int english;
	int avg;
	
	public Grade(int a, int b, int c) {
		math = a;
		science = b;
		english = c;
	}
	
	public int average() {
		avg = (math + science + english) / 3;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.print("평균은 " + me.average());
		
		scanner.close();
	}
}
