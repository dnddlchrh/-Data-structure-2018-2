package java0607;

import java.awt.*;
import javax.swing.*;

public class Java0607_4swing extends JFrame{
	public Java0607_4swing(){
		super("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl=new GridLayout(4,2);
		gl.setVgap(5);
		Container cp=getContentPane();
		cp.setLayout(gl);
		cp.setBackground(Color.yellow);
		cp.add(new JLabel("�̸�"));		
		cp.add(new JTextField(""));
		cp.add(new JLabel("�й�"));		
		cp.add(new JTextField(""));
		cp.add(new JLabel("�а�"));		
		cp.add(new JTextField(""));
		cp.add(new JLabel("����"));		
		cp.add(new JTextField(""));
		
		
		setSize(300,200);//������ ũ��300*150
		setVisible(true);//ȭ�鿡 ���������
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_4swing();
	}

}
