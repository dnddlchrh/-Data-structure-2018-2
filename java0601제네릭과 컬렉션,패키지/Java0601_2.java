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
		System.out.print(name+"시작<ENter>키>>");
		sc.nextLine();
		Calendar dt=Calendar.getInstance( );
		int second=dt.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = "+second);
		System.out.print("10초 예상 후 <Enter>키>>");
		sc.nextLine();
		dt=Calendar.getInstance( );
		int endSecond=dt.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = "+endSecond);
		
		if(endSecond < second)
			endSecond+=60;
		return Math.abs(second-endSecond);
	}
}
public class Java0601_2 {
	public void play(){
		Player player[]=new Player[2];
		player[0]=new Player("플레이어1");
		player[1]=new Player("플레이어2");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int result1=player[0].turn();
		int result2=player[1].turn();
		
		System.out.print(player[0].getname()+"의 결과"+result1+", "+player[1].getname()+"의 결과"+result2);
		
		System.out.print(", 승자는 ");
		if(Math.abs(10-result1)==Math.abs(10-result2))
			System.out.print("없음(무승부)");
		if(Math.abs(10-result1)<Math.abs(10-result2))
			System.out.print(player[0].getname());
		else if(Math.abs(10-result1)>Math.abs(10-result2))
			System.out.print(player[1].getname());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		Java0601_2 play=new Java0601_2();
		play.play();
	}

}
