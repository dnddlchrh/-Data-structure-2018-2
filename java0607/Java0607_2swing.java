package java0607;
import javax.swing.*;
import java.awt.*;
public class Java0607_2swing extends JFrame{
	public Java0607_2swing(){
		super("Contentpane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=getContentPane();
		cp.setBackground(Color.BLACK);
		cp.setLayout(new FlowLayout());
		
		cp.add(new JButton("OK"));		cp.add(new JButton("KK"));
		cp.add(new JButton("KKK"));
		setSize(300,150);//������ ũ��300*150
		setVisible(true);//ȭ�鿡 ���������
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_2swing();
	}

}
