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
		
		System.out.print("�ο���>>");
		int count = scanner.nextInt();
		PhoneBook = new Phone[count];

		for(int i = 0; i < count; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			
			PhoneBook[i] = new Phone(name, tel); 
		}
		
		System.out.println("����Ǿ����ϴ�...");
		String search_name = "";
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			search_name = scanner.next();
			if(search_name.equals("�׸�")) {
				break;
				
			}
			int search_count = 0;
			for(int i = 0; i < count; i++) {
				if(PhoneBook[i].name.equals(search_name)) {
					System.out.println(search_name + "�� ��ȣ�� " + PhoneBook[i].tel + " �Դϴ�.");
				}
				else
					search_count++;
			}
			if(search_count == count) {
				System.out.println(search_name + " �� �����ϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		PhoneBook();
	}
}
