import java.util.Scanner;

public class DicApp {
	
	class Dictionary{
		private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
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
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String input = scanner.next();
			if(input.equals("�׸�")) {
				break;
			}
			else {
				String output = Dictionary.kor2Eng(input);
				if(output.equals("")) {
					System.out.println(input + "�� ���� ������ �����ϴ�.");
				}
				else {
					System.out.println(input + "�� " + output);
				}
			}
		}
	}
}
