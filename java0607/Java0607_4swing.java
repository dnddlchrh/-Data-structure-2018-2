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
		cp.add(new JLabel("이름"));		
		cp.add(new JTextField(""));
		cp.add(new JLabel("학번"));		
		cp.add(new JTextField(""));
		cp.add(new JLabel("학과"));		
		cp.add(new JTextField(""));
		cp.add(new JLabel("과목"));		
		cp.add(new JTextField(""));
		
		
		setSize(300,200);//프레임 크기300*150
		setVisible(true);//화면에 프레임출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_4swing();
	}

}
