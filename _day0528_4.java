package day0528;
import java.util.*;
class Dictionary{
	static String outWord;
	private static String[] kor={"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng={"love","baby","money","future","hope"};
	public static String kor2Eng(String word){
		for(int i=0;i<kor.length;i++){
			if(word.equals(kor[i]))
				outWord=eng[i];
		}
		if(outWord==null)
			outWord="���� �ܾ� �Դϴ�.";
		
		return outWord;
	};
}
public class _day0528_4 {
	private Scanner sc;
	void play(){
		sc=new Scanner(System.in);
		String word;
		while(true){
			System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
			System.out.print("�ѱ� �ܾ� : ");
			word=sc.nextLine();
			if(word.equals("�׸�")|word.equals("����")){
				System.out.println("�������");
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
