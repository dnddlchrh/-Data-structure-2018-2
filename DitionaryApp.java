package day0530;

public class DitionaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic =new Dictionary(10);
		dic.put("Ȳ����", "java");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		System.out.println("�������� ����"+dic.length());
		
	}

}
