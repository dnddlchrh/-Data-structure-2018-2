package java0607;
import javax.swing.*;
import java.awt.*;
public class Java0607_5swing extends JFrame{
	public Java0607_5swing(){
		super("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(null);//����Ʈ���� ��ġ������ ����
		
		JLabel la=new JLabel("Hello, press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		cp.add(la);//la�� ����Ʈ�ҿ� ����
		for(int i=0;i<=9;i++){//9���� ��ư ������Ʈ ������ ũ��� ���� , ��ġ �ٸ���
			JButton b= new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);//��ư�� ��ġ ����
			b.setSize(50,20);//��ưũ�� 50*20
			cp.add(b);//��ư�� ����Ʈ�ҿ� ����
		}
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_5swing();
	}

}
