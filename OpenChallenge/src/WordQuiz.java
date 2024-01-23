import java.util.*;
import java.util.Scanner;

class Word {
	private String eng;
	private String kor;
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public String getKor() {
		return kor;
	}
}

class Ex {
	int ex[] = {-1, -1, -1, -1}; 
	
	public Ex(int num, int size) {
		int answerNum = (int)(Math.random()*4);
		ex[answerNum] = num; 
		for(int i=0; i<4; i++) {
			int n = (int)(Math.random()*size);
			if(ex[i]==-1) {
				ex[i] = n;
			}
			else continue;
			
			for(int j=0; j<4; j++) {
				if(i!=j && ex[j]==ex[i]) {
					ex[i] = -1;
					i--;
				}
				else continue;
			}
		}
	}
}

public class WordQuiz {
	Scanner scanner = new Scanner(System.in);
	Vector<Word> v = new Vector<Word>();
	private String name;
	
	public WordQuiz(String name) { 
		this.name = name;
		v.add(new Word("love", "���"));
		v.add(new Word("animal", "����"));
		v.add(new Word("picture", "�׸�"));
		v.add(new Word("emotion", "����"));
		v.add(new Word("baby", "�Ʊ�"));
		v.add(new Word("error", "����"));
		v.add(new Word("society", "��ȸ"));
		v.add(new Word("doll", "����"));
		v.add(new Word("bear", "��"));
		v.add(new Word("example", "����"));
		v.add(new Word("deal", "�ŷ�"));
		v.add(new Word("photo", "����"));
		v.add(new Word("human", "�ΰ�"));
		v.add(new Word("statue", "������"));
		v.add(new Word("eye", "��"));
		v.add(new Word("hand", "��"));
		v.add(new Word("ant", "����"));
	}
	
	public void Run() {
		System.out.println("\"" + name + "\"" + "�� �ܾ� �½�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + v.size() + "�� �ܾ ����ֽ��ϴ�.");
		Quiz();
	}
	
	public void Quiz() {
		while(true) {
			int num = (int)(Math.random()*v.size()); 
			String e = v.get(num).getEng(); 
			System.out.println(e + "?");
			
			Ex example = new Ex(num, v.size());
			for(int i=0; i<4; i++) {
				System.out.print("(" + (i+1) + ")" + v.get(example.ex[i]).getKor() + " :");
			}
			int sel = scanner.nextInt();
			if(sel == -1) {
				System.out.println("\"" + name + "\"" + "�� �����մϴ�");
				return;
			}
			else if(example.ex[(sel-1)] == num)
				System.out.println("Excellent !!");
			else
				System.out.println("No. !!");
		}
	}
	
	public static void main(String[] args) {
		WordQuiz wq = new WordQuiz("��ǰ����");
		wq.Run();
	}
}
