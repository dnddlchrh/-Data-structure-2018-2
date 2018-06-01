package java0601;

import java.util.*;
public class Java0601_3 {
	private Scanner sc=new Scanner(System.in);
	void play(){
		System.out.println("문자열을 입력하세요");
		String string=sc.nextLine();
		int length=string.length();
		for(int i=0;i<length;i++){
			String first=string.substring(0,1);
			
			String last=string.substring(1,string.length());
			string=last+first;
			System.out.println(string);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java0601_3 play=new Java0601_3();
		play.play();
	}

}
