import java.util.Scanner;

public class ScoreArray {
	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTMLS", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while(!input.equals("stop")) {
			System.out.print("과목 이름>>");
			input = scanner.next();
			for(int i = 0; i < 4; i++) {
				if(!input.equals(course[i])) {
					System.out.println("없는 과목입니다.");
					break;

				}
				else {
					System.out.println(input + "의 점수는 " + score[i]);
					break;
					
				}
			}
			
			
		}
	
		
		
	}
}
