package java0604;

import java.util.HashMap;
import java.util.Scanner;

public class Java0604_4 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		sc = new Scanner(System.in);
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true){
			
			System.out.print("�̸��� ����Ʈ �Է�>>");
			String name=sc.next();
			if(name.equals("�׸�"))
				break;
			int point=sc.nextInt();
			if(h.get(name)!=null)
				point+=h.get(name);
			h.put(name, point);
			System.out.println(h);
			
		}
		
	}

}
