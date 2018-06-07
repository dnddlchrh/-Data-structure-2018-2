package java0607;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class Java0607_10 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Park\\Desktop\\박찬웅\\phone.txt");
		// TODO Auto-generated method stub
		try {
			HashMap<String,String> h=new HashMap<String,String>();
			Scanner sc=new Scanner(System.in);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			System.out.println("총 7개의 번호를 읽었습니다");
			while(true) {
				String line1=br.readLine();
				String line2=br.readLine();
				h.put(line1, line2);
				System.out.print("이름>>");
				String s=sc.nextLine();
				if(s.equals("그만"))break;
				System.out.println(h.get(s));;
				
			}
			fr.close();
			sc.close();
			}
		catch(IOException e) {System.out.println(e);}
		
		
	}

}
