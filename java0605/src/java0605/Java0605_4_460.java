package java0605;
import java.io.*;
public class Java0605_4_460 {
	public static void main(String[] args){
		byte b[]={7,51,3,4,-1,24};
		try{
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			for(int i=0;i<b.length;i++)
				fout.write(b[i]);
			fout.close();
		}catch(IOException e){
			System.out.println("c:\\Temp\\test.out�� ������ �� �������ϴ�. ��θ� Ȯ�� ��Ź");
			return;
		}
		System.out.println("c:\\Temp\\test.out�� �����Ͽ����ϴ�.");
	}
}
