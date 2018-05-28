package day0528;
import java.util.*;
public class _day0528_1 {

	public int Grade(int math,int science,int english){
		return (math+science+english)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("수 과 영 순으로 3개의 점수 입력");
		int math=sc.nextInt();
		int science=sc.nextInt();
		int english=sc.nextInt();
		_day0528_1 ta=new _day0528_1();
		int average=ta.Grade(math, science, english);
		
		System.out.println(average);
		sc.close();
	}

}
