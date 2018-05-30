package day0530;

public class DitionaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic =new Dictionary(10);
		dic.put("황기태", "java");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		System.out.println("아이템의 갯수"+dic.length());
		
	}

}
