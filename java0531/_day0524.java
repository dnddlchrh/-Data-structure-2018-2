package day0524;
import java.util.*;
public class _day0524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(a[i]%3==0){
				System.out.print(a[i]+" ");
			}
			
		}
		sc.close();
	}

}
