package java0601;
import java.util.*;
class Player{
	private Scanner sc=new Scanner(System.in);
	private String name;
	public Player(String name){
		this.name=name;
	}
	public String getname(){return name;}
	public int turn(){
		System.out.print(name+"����<ENter>Ű>>");
		sc.nextLine();
		Calendar dt=Calendar.getInstance( );
		int second=dt.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = "+second);
		System.out.print("10�� ���� �� <Enter>Ű>>");
		sc.nextLine();
		dt=Calendar.getInstance( );
		int endSecond=dt.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = "+endSecond);
		
		if(endSecond < second)
			endSecond+=60;
		return Math.abs(second-endSecond);
	}
}
public class Java0601_2 {
	public void play(){
		Player player[]=new Player[2];
		player[0]=new Player("�÷��̾�1");
		player[1]=new Player("�÷��̾�2");
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int result1=player[0].turn();
		int result2=player[1].turn();
		
		System.out.print(player[0].getname()+"�� ���"+result1+", "+player[1].getname()+"�� ���"+result2);
		
		System.out.print(", ���ڴ� ");
		if(Math.abs(10-result1)==Math.abs(10-result2))
			System.out.print("����(���º�)");
		if(Math.abs(10-result1)<Math.abs(10-result2))
			System.out.print(player[0].getname());
		else if(Math.abs(10-result1)>Math.abs(10-result2))
			System.out.print(player[1].getname());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		Java0601_2 play=new Java0601_2();
		play.play();
	}

}
