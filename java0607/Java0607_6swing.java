package java0607;
import java.awt.*;
import javax.swing.*;
public class Java0607_6swing extends JFrame{
	public Java0607_6swing(){
		super("JLabel random Sample");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		setSize(300,300);
		setVisible(true);
		for(int i=0;i<=20;i++){//9���� ��ư ������Ʈ ������ ũ��� ���� , ��ġ �ٸ���
			JLabel la=new JLabel(Integer.toString(i));
			int x=(int)(Math.random()*200)+50;//50~250
			int y=(int)(Math.random()*200)+50;//50~250
			la.setLocation(x,y);//��ư�� ��ġ ����
			la.setSize(10,10);//��ưũ�� 50*20
			la.setOpaque(true);
			la.setBackground(Color.blue);
			cp.add(la);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_6swing();
	}

}
