package java0611;
import java.awt.*;
import javax.swing.*;
public class Java0611_8 extends JFrame{
	public Java0611_8(){
		super("�ؽ�Ʈ�ʵ� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(20));//â�� �� ���� 20
		c.add(new JLabel("�а�"));
		c.add(new JTextField("��ǻ�Ͱ��а�",20));
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField("�����...",20));
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_8();
	}
}
