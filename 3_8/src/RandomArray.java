import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		int Array[];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int input = scanner.nextInt();
	
		if(input < 0 || input > 100) {
			System.out.print("업력 범위를 초과하였습니다.");
			System.exit(0);
		}
		else {
			Array = new int [input];
			
			for(int i = 0; i < input; i++) {
				int value = (int)(Math.random()*100 + 1);
				
				for(int j = 0; j < input; j++) {
					if(value != Array[j]) {
						Array[i] = value;
					}
					else
						break;
				}
			}
			
			
			for(int i = 0; i < input; i++) {
				System.out.println(Array[i]);
			}
		}
	}
}
