package day0524;
import java.util.*;
public class _day4_0524 {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		int n=(int)(Math.random()*3);
		int num=0;
		String str="";
		System.out.println("콤퓨터와 가위바위보!");
		
		while(true){
		n=(int)(Math.random()*3);
		System.out.print("가위 바위 보 : ");
		str=sc.next();	
			if(str.equals("가위")){
				num=0;
			}else if(str.equals("바위")){
				num=1;
			}else if(str.equals("보")){
				num=2;
			}else if(str.equals("그만")){
				num=3;
				break;
			}
			if(n==0){
				System.out.println("콥퓨터는 가위");
			}else if(n==1){
				System.out.println("콥퓨터는 바위");
			}else if(n==2){
				System.out.println("콥퓨터는 보");
			}
			switch(num){
			case 0:
				if(n==0){
					System.out.println("비겨따");
				}else if(n==1){
					System.out.println("져따");
				}else if(n==2){
					System.out.println("이겨따");
				}break;
			case 1:
				if(n==0){
					System.out.println("이겨따");
				}else if(n==1){
					System.out.println("비겨따");
				}else if(n==2){
					System.out.println("져따");
				}break;
			case 2:
				if(n==0){
					System.out.println("져따");
				}else if(n==1){
					System.out.println("이겨따");
				}else if(n==2){
					System.out.println("비겨따");
				}break;
			}
		}
		
	}
	
}
