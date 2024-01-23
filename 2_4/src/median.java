import java.util.Scanner;

public class median {
	public static void main(String[] args) {
		System.out.println("정수 3개를 입력해주세요.");
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		
		int first = a.nextInt();
		int second = b.nextInt();
		int third = c.nextInt();
		int mid = 0;
		
		if(first >= second) {
			if(second >= third) {
				mid  = second;
			}
			else if(third <= first) {
				mid = third;
			}
			else {
				mid = first;
			}
		}
		else if(first > third) {
			mid = first;
		}
		else if(second > third) {
			mid = third;
		}
		else {
			mid = second;
		}
		
		System.out.println("중간값 : " + mid);
		
	}
}
