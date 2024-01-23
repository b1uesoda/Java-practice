import java.util.Scanner;

public class DicApp {
	
	class Dictionary{
		private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
		private static String [] eng = { "love", "baby", "money", "future", "hope" };
		private static String kor2Eng(String word) {
			String Eng_word = "";
			for(int i = 0; i < kor.length; i++) {
				if(word.equals(kor[i])) {
					Eng_word = eng[i];
				}
			}
			return Eng_word;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("한글 단어?");
			String input = scanner.next();
			if(input.equals("그만")) {
				break;
			}
			else {
				String output = Dictionary.kor2Eng(input);
				if(output.equals("")) {
					System.out.println(input + "는 저의 사전에 없습니다.");
				}
				else {
					System.out.println(input + "은 " + output);
				}
			}
		}
	}
}
