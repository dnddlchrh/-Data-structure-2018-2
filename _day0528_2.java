package day0528;
import java.util.*;
class phone{
	String name;
	String num;
	public phone(String name,String num){
		this.name=name;
		this.num=num;
	}
	public String Name(){return name;}//객체배열에 있는 이름을 반환받음
	public String Num(){return num;}//객체배열에 있는 전화번호를 반환받음
}
public class _day0528_2 {
	private phone [] ph;//객체배열
	private Scanner sc;//스캐너
	void play(){
		sc=new Scanner(System.in);
		System.out.print("인원수 : ");//이름과 전화번호 저장하는 갯수 설정
		int n=sc.nextInt();
		ph=new phone[n];
		for(int i=0;i<ph.length;i++){
			System.out.print("이름과 전화번호(빈 칸없이)>>");
			String name=sc.next();
			String num=sc.nextLine();
			ph[i]=new phone(name,num);
		}
		System.out.println("저장완료");
	}
	String search(String name){
		for(int i=0;i<ph.length;i++){
			if(ph[i].Name().equals(name))//ph[i]에 들어있는 name과 입력한name이 같을시에 전화번호 반환 
				return ph[i].Num();
		}
		return null;//아닐시 공백 반환
	}
	void play1(){
		play();//play를 play1에서 실행
		while(true){//무한반복
			System.out.print("search name : ");
			String name =sc.next();
			if(name.equals("그만")){//그만을 쳣을경우 반복문 탈출
				System.out.println("종료");
				break;
			}
			String num = search(name);//search에서 반환한 num
			if(num==null)//전화번호가 공백일 경우 없다고 출력
				System.out.println(name+"이 없습니다");
			else//전화번호가 공백이 아닐경우 출력
				System.out.println(name+"의 번호는"+num+"입니다");
		}
	}
	public static void main(String[] args){
		_day0528_2 day=new _day0528_2();//객체 생성
		day.play1();//실행
	}
	
	
}
