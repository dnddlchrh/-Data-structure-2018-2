package day0524;
import java.util.*;
public class _day4_0524 {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		int n=(int)(Math.random()*3);
		int num=0;
		String str="";
		System.out.println("��ǻ�Ϳ� ����������!");
		
		while(true){
		n=(int)(Math.random()*3);
		System.out.print("���� ���� �� : ");
		str=sc.next();	
			if(str.equals("����")){
				num=0;
			}else if(str.equals("����")){
				num=1;
			}else if(str.equals("��")){
				num=2;
			}else if(str.equals("�׸�")){
				num=3;
				break;
			}
			if(n==0){
				System.out.println("��ǻ�ʹ� ����");
			}else if(n==1){
				System.out.println("��ǻ�ʹ� ����");
			}else if(n==2){
				System.out.println("��ǻ�ʹ� ��");
			}
			switch(num){
			case 0:
				if(n==0){
					System.out.println("��ܵ�");
				}else if(n==1){
					System.out.println("����");
				}else if(n==2){
					System.out.println("�̰ܵ�");
				}break;
			case 1:
				if(n==0){
					System.out.println("�̰ܵ�");
				}else if(n==1){
					System.out.println("��ܵ�");
				}else if(n==2){
					System.out.println("����");
				}break;
			case 2:
				if(n==0){
					System.out.println("����");
				}else if(n==1){
					System.out.println("�̰ܵ�");
				}else if(n==2){
					System.out.println("��ܵ�");
				}break;
			}
		}
		
	}
	
}
