package java0604;

import java.util.HashMap;
import java.util.Scanner;

public class Java0604_4 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		sc = new Scanner(System.in);
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true){
			
			System.out.print("이름과 포인트 입력>>");
			String name=sc.next();
			if(name.equals("그만"))
				break;
			int point=sc.nextInt();
			if(h.get(name)!=null)
				point+=h.get(name);
			h.put(name, point);
			System.out.println(h);
			
		}
		
	}

}
