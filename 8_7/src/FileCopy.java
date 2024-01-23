import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class FileCopy {
 
	public static void main(String[] args) {
		File a,b;
		FileInputStream fin;
		FileOutputStream fout;
		long  n,total;
		try {
			a=new File("c:/a.jpg");
			b=new File("c:/b.jpg");
			
			System.out.println(a.getName()+"�� "+b.getName()+"�� �����մϴ�.");
			System.out.println("10%���� *�� ����մϴ�.");
			fin=new FileInputStream(a);
			fout=new FileOutputStream(b);
			
			int c;
			n=0;
			total=a.length();
			
			while((c=fin.read())!=-1) {
				fout.write((byte)c);
				n=(n+1);
				if(n==total/10) {
					System.out.print("*");
					n=0;
				}
			}
			fin.close();
			fout.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
 
}