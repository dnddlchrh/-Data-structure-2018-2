package java0611;
import java.awt.*;
import javax.swing.*;
public class Java0611_6 extends JFrame{
	public Java0611_6(){
		super("���� ��ư �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon a = new ImageIcon("images/a.png");//��������
		ImageIcon b = new ImageIcon("images/b.png");//���û���
		
		ButtonGroup g=new ButtonGroup();
		JRadioButton apple=new JRadioButton("���");
		JRadioButton pear=new JRadioButton("��",true);
		JRadioButton cherry=new JRadioButton("ü��",a);
		cherry.setBorderPainted(true);//�̹��� ������ư�� �ܰ��� ���
		cherry.setSelectedIcon(b);//���� ���� �̹��� ���
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_6();
	}
}
