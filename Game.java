package homework;
import java.util.*;
public class Game {
	int left1=1;
	int right1=1;
	int left2=1;
	int right2=1;
	int num=0;
	int num1;
	int num2;
	int min;
	private Scanner sc;
	void zero() {
		if(left1>=5) {left1=0;}
		if(left2>=5) {left2=0;}
		if(right1>=5) {right1=0;}
		if(right2>=5) {right2=0;}
	}
	void attack1() {
		if(num1==1&&num2==1) {
			left2=left2+left1;
		}else if(num1==2&&num2==1) {
			left2=left2+right1;
		}else if(num1==1&&num2==2) {
			right2=right2+left1;
		}else if(num1==2&&num2==2) {
			right2=right2+right1;
		}else {
			System.out.println("��� �����Ͻô°̴ϱ�?");
		}
	}	
	void attack2() {
		if(num1==1&&num2==1) {
			left1=left1+left2;
		}else if(num1==2&&num2==1) {
			left1=left1+right2;
		}else if(num1==1&&num2==2) {
			right1=right1+left2;
		}else if(num1==2&&num2==2) {
			right1=right1+right2;
		}else {
			System.out.println("��� �����Ͻô°̴ϱ�?");
		}
	}
	void player1() {
		switch(num) {
			case 1: 
				System.out.print("��������� �����ϱ�ڽ��ϱ� �޼�(1) :"+left1+", ������(2) :"+right1+">>");
				num1=sc.nextInt();
				System.out.print("��� �����Ͻðڽ��ϱ� ����(1) :"+left2+", ������(2) :"+right2+">>");
				num2=sc.nextInt();
				attack1();
				zero();
				System.out.println(left2+","+right2);
				break;
			case 2:
				System.out.print("¦! �Է��� ���� ���������� ��>>");min=sc.nextInt();
				jjack1();
				break;
					}
		}
void player2() {
		
		switch(num) {
			case 1: 
				System.out.print("��������� �����ϱ�ڽ��ϱ� �޼�(1) :"+left2+", ������(2) :"+right2+">>");
				num1=sc.nextInt();
				System.out.print("��� �����Ͻðڽ��ϱ� ����(1) :"+left1+", ������(2) :"+right1+">>");
				num2=sc.nextInt();
				attack2();
				zero();
				System.out.println(left1+","+right1);
				break;
			case 2:
				System.out.print("¦! �Է��� ���� ���������� ��>>");min=sc.nextInt();
				jjack2();
				break;
					}
		}
	void jjack1() {
		int sum=left1+right1;
		left1=0;
		right1=0;
		sum=sum-min;
		right1=min;
		left1=sum;
		if(sum>=5) {
			System.out.println("�ȳ����� �� ����");
		}
	}
	void jjack2() {
		int sum=left2+right2;
		left2=0;
		right2=0;
		sum=sum-min;
		right2=min;
		left2=sum;
		if(sum>=5) {
			System.out.println("�ȳ����� �� ����");
		}
	}
	void play() {
		sc=new Scanner(System.in);
		
		System.out.println("���������� ����!");
		while(num!=4) {
			System.out.println("player1 turn");
			System.out.print("�������� ������ ����(1), ¦(2), ��Ȳ����(3), ����(4)>>");
			num=sc.nextInt();
			if(num==3) {System.out.println("player1 ��:"+left1+", ��:"+right1+" player2 ��:"+left2+", ��:"+right2);continue;}
			if(num==4) {break;}
			player1();
			if(left1==0&&right1==0) {System.out.println("���ڴ�player2");break;}
			if(left2==0&&right2==0) {System.out.println("���ڴ�player1");break;}
			System.out.println("player2 turn");
			System.out.print("�������� ������ ����(1), ¦(2), ��Ȳ����(3), ����(4)>>");
			num=sc.nextInt();
			if(num==3) {System.out.println("player1 ��:"+left1+", ��:"+right1+" player2 ��:"+left2+", ��:"+right2);continue;}
			player2();
			if(left1==0&&right1==0) {System.out.println("���ڴ�player2");break;}
			if(left2==0&&right2==0) {System.out.println("���ڴ�player1");break;}
		}
		
	}
	public static void main(String[] args) {
		Game game=new Game();
		game.play();
	}
}
