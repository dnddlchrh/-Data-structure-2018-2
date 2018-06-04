package java0604;
import java.util.*;
public class Java0604_2 {
	static void printList(LinkedList<String> l){//����Ʈ ��Ҹ� ��� ���
		
		Iterator<String> it=l.iterator();//Iterator ��ü ����
		while(it.hasNext()){//��ü�� ��Ұ� ���� ����� �ݺ�
			String e =it.next();//���� ��� ����
			String separator;
			if(it.hasNext())//������ ��Ұ� �ƴϸ� -> ����
				separator="->";
			else
				separator="\n";//�������̸� �ٹٲ�
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList=new LinkedList<String>();//�� ����Ʈ ����
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		
		Collections.sort(myList);//��� ����
		printList(myList);//���ĵ� ��� ���
		
		Collections.reverse(myList);//��� �ݴ�� ����
		printList(myList);//��� ���
		
		int index=Collections.binarySearch(myList, "�ƹ�Ÿ")+1;
		System.out.println("�ƹ�Ÿ�� "+index+"��° ����Դϴ�.");
	}

}
