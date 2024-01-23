import java.util.Scanner;
public class Phone {
	String name;
	String tel;
	
	public Phone(String n, String t) {
		name = n;
		tel = t;
	}
	
	public static void PhoneBook() {
		Phone [] PhoneBook;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int count = scanner.nextInt();
		PhoneBook = new Phone[count];

		for(int i = 0; i < count; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			
			PhoneBook[i] = new Phone(name, tel); 
		}
		
		System.out.println("저장되었습니다...");
		String search_name = "";
		
		while(true) {
			System.out.print("검색할 이름>>");
			search_name = scanner.next();
			if(search_name.equals("그만")) {
				break;
				
			}
			int search_count = 0;
			for(int i = 0; i < count; i++) {
				if(PhoneBook[i].name.equals(search_name)) {
					System.out.println(search_name + "의 번호는 " + PhoneBook[i].tel + " 입니다.");
				}
				else
					search_count++;
			}
			if(search_count == count) {
				System.out.println(search_name + " 이 없습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		PhoneBook();
	}
}
