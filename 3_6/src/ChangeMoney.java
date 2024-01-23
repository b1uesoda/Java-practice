import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		System.out.print("금액을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		System.out.println("50000원 짜리 : " + input / 50000 + "개");
		System.out.println("10000원 짜리 : " + (input % 50000) / 10000 + "개");
		System.out.println("1000원 짜리 : " + (input % 10000) / 1000 + "개");
		System.out.println("500원 짜리 : " + (input % 1000) / 500 + "개");
		System.out.println("100원 짜리 : " + (input % 500) / 100 + "개");
		System.out.println("50원 짜리 : " + (input % 100) / 50 + "개");
		System.out.println("10원 짜리 : " + (input % 50) / 10 + "개");
		System.out.println("1원 짜리 : " + (input % 10) + "개");
	}
}