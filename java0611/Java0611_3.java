package java0611;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Java0611_3 extends JFrame {
	public Java0611_3(){
		super("이미지 버튼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon a = new ImageIcon("images/a.png");
		ImageIcon b = new ImageIcon("images/b.png");
		ImageIcon c1 = new ImageIcon("images/c.png");
		JButton btn = new JButton("call~~",a);
		btn.setPressedIcon(c1);
		btn.setRolloverIcon(b);
		c.add(btn);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_3();
	}
}
