package java0607;
import java.awt.*;
import javax.swing.*;
public class Java0607_8swing extends JFrame{
	public Java0607_8swing(){
		super("Calculator Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container cp = getContentPane();
		cp.add(new South(), BorderLayout.SOUTH);
		cp.add(new Center(),BorderLayout.CENTER);
		cp.add(new North(),BorderLayout.NORTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_8swing();
	}

}
class South extends JPanel{
	public South(){
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("Word Input"));
		add(new JTextField(15));
	}
}
class Center extends JPanel{
	public Center(){
		setLayout(null);
		
		for(int i=0;i<=10;i++){//9���� ��ư ������Ʈ ������ ũ��� ���� , ��ġ �ٸ���
			JLabel la=new JLabel("*");
			int x=(int)(Math.random()*150)+50;//50~250
			int y=(int)(Math.random()*150)+50;//50~250
			la.setLocation(x,y);//��ư�� ��ġ ����
			la.setSize(10,10);//��ưũ�� 5*5
			la.setBackground(Color.WHITE);
			la.setForeground(Color.red);
			la.setOpaque(true);
			add(la);
		}
		setBackground(Color.WHITE);
	}
}
class North extends JPanel{
	public North(){
		setBackground(Color.GRAY);
		setOpaque(true);
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
	}
}