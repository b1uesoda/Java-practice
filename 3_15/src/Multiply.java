import java.util.Scanner;

public class Multiply {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		
		
		while(true){
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				n = scanner.nextInt();
				m = scanner.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);

			}
			catch(Exception e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
			}
		}
	}
}
