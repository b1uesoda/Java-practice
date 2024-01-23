import java.util.Scanner;

public class divandremain {
	public static void main(String[] args) {
		System.out.println("2자리 정수 (10~99)를 입력해주세요.");
		Scanner a = new Scanner(System.in);
		
		int input = a.nextInt();
		if(input < 10 || input > 99) {
			System.out.println("입력 값이 범위를 초과하였습니다.");
		}
		else {
			int ten = input / 10;
			int one = (input - (ten * 10));
			if(ten == one) {
				System.out.println("십의 자리와 일의 자리가 같습니다.");
			}
			else {
				System.out.println("십의 자리와 일의 자리가 다릅니다.");
			}
		}
	}
}
