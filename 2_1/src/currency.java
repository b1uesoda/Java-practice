import java.util.Scanner;

public class currency {
	public static void main(String[] args) {
	
		System.out.println("��ȭ�� �Է��ϼ���.");
		Scanner a = new Scanner(System.in);
		double won = a.nextDouble();
		double dollar = won / 1100;
		System.out.println(dollar + "�޷� �Դϴ�.");
		
	}
}
