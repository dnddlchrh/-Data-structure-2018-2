package day0528;
import java.util.*;
class phone{
	String name;
	String num;
	public phone(String name,String num){
		this.name=name;
		this.num=num;
	}
	public String Name(){return name;}//��ü�迭�� �ִ� �̸��� ��ȯ����
	public String Num(){return num;}//��ü�迭�� �ִ� ��ȭ��ȣ�� ��ȯ����
}
public class _day0528_2 {
	private phone [] ph;//��ü�迭
	private Scanner sc;//��ĳ��
	void play(){
		sc=new Scanner(System.in);
		System.out.print("�ο��� : ");//�̸��� ��ȭ��ȣ �����ϴ� ���� ����
		int n=sc.nextInt();
		ph=new phone[n];
		for(int i=0;i<ph.length;i++){
			System.out.print("�̸��� ��ȭ��ȣ(�� ĭ����)>>");
			String name=sc.next();
			String num=sc.nextLine();
			ph[i]=new phone(name,num);
		}
		System.out.println("����Ϸ�");
	}
	String search(String name){
		for(int i=0;i<ph.length;i++){
			if(ph[i].Name().equals(name))//ph[i]�� ����ִ� name�� �Է���name�� �����ÿ� ��ȭ��ȣ ��ȯ 
				return ph[i].Num();
		}
		return null;//�ƴҽ� ���� ��ȯ
	}
	void play1(){
		play();//play�� play1���� ����
		while(true){//���ѹݺ�
			System.out.print("search name : ");
			String name =sc.next();
			if(name.equals("�׸�")){//�׸��� ������� �ݺ��� Ż��
				System.out.println("����");
				break;
			}
			String num = search(name);//search���� ��ȯ�� num
			if(num==null)//��ȭ��ȣ�� ������ ��� ���ٰ� ���
				System.out.println(name+"�� �����ϴ�");
			else//��ȭ��ȣ�� ������ �ƴҰ�� ���
				System.out.println(name+"�� ��ȣ��"+num+"�Դϴ�");
		}
	}
	public static void main(String[] args){
		_day0528_2 day=new _day0528_2();//��ü ����
		day.play1();//����
	}
	
	
}
