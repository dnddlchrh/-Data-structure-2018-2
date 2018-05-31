package day0524;
import java.util.*;
public class _day2_0524 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char b=a.charAt(0);
		
		for(char i=b;i>='a';i--){
			for(char j='a';j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		for(char i=b;i>='A';i--){
			for(char j='A';j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		
		
		sc.close();
	}
}
