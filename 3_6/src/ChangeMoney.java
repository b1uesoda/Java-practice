import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		System.out.println("50000�� ¥�� : " + input / 50000 + "��");
		System.out.println("10000�� ¥�� : " + (input % 50000) / 10000 + "��");
		System.out.println("1000�� ¥�� : " + (input % 10000) / 1000 + "��");
		System.out.println("500�� ¥�� : " + (input % 1000) / 500 + "��");
		System.out.println("100�� ¥�� : " + (input % 500) / 100 + "��");
		System.out.println("50�� ¥�� : " + (input % 100) / 50 + "��");
		System.out.println("10�� ¥�� : " + (input % 50) / 10 + "��");
		System.out.println("1�� ¥�� : " + (input % 10) + "��");
	}
}