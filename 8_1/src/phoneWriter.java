import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class phoneWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		File f = new File("c:\\phone.txt");
		try {
			fw = new FileWriter(f);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = scanner.nextLine(); 
				if(line.equals("�׸�"))
						break; 
				fw.write(line+"\r\n"); 
			}
			System.out.println(f.getPath()+"�� �����Ͽ����ϴ�.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) { 
			e.printStackTrace();
		}
	}

}