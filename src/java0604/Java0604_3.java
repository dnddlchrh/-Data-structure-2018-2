package java0604;
import java.util.*;
public class Java0604_3 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		sc = new Scanner(System.in);
		int input;
		int sum=0;
		while(true){
			System.out.print("강수량 입력 (0:종료)>>");input=sc.nextInt();
			v.add(input);sum+=input;
			System.out.println(v);
			System.out.println("평균"+(double)sum/v.size());
			if(input==0)
				break;
		}
	}

}
