import java.util.Scanner;

public class ScoreArray {
	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTMLS", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while(!input.equals("stop")) {
			System.out.print("���� �̸�>>");
			input = scanner.next();
			for(int i = 0; i < 4; i++) {
				if(!input.equals(course[i])) {
					System.out.println("���� �����Դϴ�.");
					break;

				}
				else {
					System.out.println(input + "�� ������ " + score[i]);
					break;
					
				}
			}
			
			
		}
	
		
		
	}
}
