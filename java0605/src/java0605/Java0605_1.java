package java0605;
import java.io.*;
public class Java0605_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin=null;
		try{
			fin=new FileReader("c:\\windows\\system.ini");
			int c;
			while((c=fin.read())!=-1){
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e){
			System.out.println("����� ����");
		}
	}

}
