import java.util.*;

public class RainfallStatistics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> pre = new Vector<Integer>();
		
		while(true) {
			double sum = 0;
			System.out.print("������ �Է�(0 �Է� �� ����)>>");
			int n = scanner.nextInt();
			if (n == 0) break;
			
			pre.add(n);
			for(int i = 0; i < pre.size(); i++) {
				System.out.print(pre.get(i) +" ");
				sum += pre.get(i);
			}
			System.out.println();
			System.out.println("���� ��� " + sum / pre.size());
		}
		scanner.close();
	}
}