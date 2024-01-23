import java.util.Scanner;

public class currency {
	public static void main(String[] args) {
	
		System.out.println("원화를 입력하세요.");
		Scanner a = new Scanner(System.in);
		double won = a.nextDouble();
		double dollar = won / 1100;
		System.out.println(dollar + "달러 입니다.");
		
	}
}
