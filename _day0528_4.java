package day0528;
import java.util.*;
class Dictionary{
	static String outWord;
	private static String[] kor={"사랑","아기","돈","미래","희망"};
	private static String[] eng={"love","baby","money","future","hope"};
	public static String kor2Eng(String word){
		for(int i=0;i<kor.length;i++){
			if(word.equals(kor[i]))
				outWord=eng[i];
		}
		if(outWord==null)
			outWord="없는 단어 입니다.";
		
		return outWord;
	};
}
public class _day0528_4 {
	private Scanner sc;
	void play(){
		sc=new Scanner(System.in);
		String word;
		while(true){
			System.out.println("한영 단어 검색 프로그램입니다.");
			System.out.print("한글 단어 : ");
			word=sc.nextLine();
			if(word.equals("그만")|word.equals("종료")){
				System.out.println("사용중지");
				break;
			}
			System.out.println(Dictionary.kor2Eng(word));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_day0528_4 play=new _day0528_4();
		play.play();
	}

}
