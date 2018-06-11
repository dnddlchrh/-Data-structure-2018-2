package java0611;
import java.awt.*;
import javax.swing.*;
public class Java0611_10 extends JFrame{
	private String [] fruits={"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	public Java0611_10(){
		super("리스트 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList=new JList<String>(fruits);
		c.add(strList);
		JList<String> scrollList=new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_10();
	}
}
