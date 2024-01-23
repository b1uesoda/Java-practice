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
			
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = scanner.nextLine(); 
				if(line.equals("그만"))
						break; 
				fw.write(line+"\r\n"); 
			}
			System.out.println(f.getPath()+"에 저장하였습니다.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) { 
			e.printStackTrace();
		}
	}

}