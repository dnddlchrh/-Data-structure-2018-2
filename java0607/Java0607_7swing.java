package java0607;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Java0607_7swing extends JFrame{
	
	public Java0607_7swing(){
		super("Calculator Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container cp = getContentPane();
		cp.add(new SouthPanel(), BorderLayout.SOUTH);
		cp.add(new CenterPanel(), BorderLayout.CENTER);
		cp.add(new NorthPanel(),BorderLayout.NORTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_7swing();
	}

}
class SouthPanel extends JPanel{
	public SouthPanel(){
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("계산결과"));
		add(new JTextField(15));
	}
}
class CenterPanel extends JPanel{
	JButton b[]={new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
	public CenterPanel(){
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4,4,5,5));
		for(int i=0;i<=9;i++){
			JButton b=new JButton(Integer.toString(i));
			add(b);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
		for(int i= 0;i<b.length;i++){
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}
	}
}
class NorthPanel extends JPanel{
	public NorthPanel(){
		setBackground(Color.GRAY);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("계산결과"));
		add(new JTextField(17));}
}
