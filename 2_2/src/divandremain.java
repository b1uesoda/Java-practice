import java.util.Scanner;

public class divandremain {
	public static void main(String[] args) {
		System.out.println("2�ڸ� ���� (10~99)�� �Է����ּ���.");
		Scanner a = new Scanner(System.in);
		
		int input = a.nextInt();
		if(input < 10 || input > 99) {
			System.out.println("�Է� ���� ������ �ʰ��Ͽ����ϴ�.");
		}
		else {
			int ten = input / 10;
			int one = (input - (ten * 10));
			if(ten == one) {
				System.out.println("���� �ڸ��� ���� �ڸ��� �����ϴ�.");
			}
			else {
				System.out.println("���� �ڸ��� ���� �ڸ��� �ٸ��ϴ�.");
			}
		}
	}
}
