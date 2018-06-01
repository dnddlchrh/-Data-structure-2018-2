package java0601;

import java.util.Iterator;
import java.util.Vector;

public class Java0601_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()){
			int n=it.next();
			System.out.println(n);
		}
		int sum=0;
		it = v.iterator();
		while(it.hasNext()){
			int n=it.next();
			sum+=n;
		}
		System.out.println("백터에 있는 정수 합"+sum);
	}

}
