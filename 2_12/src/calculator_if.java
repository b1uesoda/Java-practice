import java.util.Scanner;

public class calculator_if {
	public static void main(String[] args) {

		
		float result = 0;
		Scanner scanner = new Scanner(System.in);
		
		float num1 = scanner.nextInt();
		String operator = scanner.next();
		float num2 = scanner.nextInt();
		
		if(operator.equals("/")) {
			System.out.print("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
		else if(operator.equals("+"))
			result = num1 + num2;
		else if(operator.equals("-"))
			result = num1 - num2;
		else if(operator.equals("*"))
			result  = num1 * num2;
		else if(operator.equals("/"))
			result = num1 / num2;
		
		System.out.print("결과값 : " + result);
		scanner.close();
		
	}
}
