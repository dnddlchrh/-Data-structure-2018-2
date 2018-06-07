package java0607;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Java0607_3swing extends JFrame{
	public Java0607_3swing(){
		super("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		
		cp.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		cp.setBackground(Color.BLACK);
		cp.add(new JButton("OK"));		
		cp.add(new JButton("KK"));
		cp.add(new JButton("KKK"));
		cp.add(new JButton("div"));
		cp.add(new JButton("Calculate"));
		
		setSize(300,200);//프레임 크기300*150
		setVisible(true);//화면에 프레임출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_3swing();
	}

}
