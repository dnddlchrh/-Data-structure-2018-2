package java0611;
import java.awt.*;
import javax.swing.*;
public class Java0611_8 extends JFrame{
	public Java0611_8(){
		super("텍스트필드 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));//창의 열 개수 20
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과",20));
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시...",20));
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_8();
	}
}
