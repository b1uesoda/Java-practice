import java.util.Scanner;

public class three_six_nine {
	public static void main(String[] args) {
		System.out.println("1~99 ������ ������ �Է����ּ���.");
		Scanner a = new Scanner(System.in);
		
		int input = a.nextInt();
		int count = 0;
		
		if(input < 1 || input > 99) {
			System.out.println("�Է� ���� ������ �ʰ��Ͽ����ϴ�.");
		}
		else {
			int ten = input / 10;
			int one = (input - (ten * 10));
			if(ten == 3 || ten == 6 || ten == 9) {
				count++;
				if(one == 3 || one == 6 || one == 9) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println("�ڼ�¦");
			}
			else if(count == 2) {
				System.out.println("�ڼ�¦¦");
			}
		}
	}
}
