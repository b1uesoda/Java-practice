import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		
		char index = 'a';
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char input = scanner.next().charAt(0);
		
		int start = index;
		int end = input;
		int count = end - start + 1;
	
		while(count != 0) {
			for(int i = count; i > 0; i--) {
				System.out.print(index);
				index = (char)(index + 1);
			}
			System.out.println();
			count--;
			index = 'a';
		}
		scanner.close();
	}
	
}
