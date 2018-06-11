package java0611;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
public class Java0611_4 extends JFrame{
	public Java0611_4(){
		super("체크박스 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon a = new ImageIcon("images/a.png");
		ImageIcon b = new ImageIcon("images/b.png");
		JCheckBox apple =new JCheckBox("사과");
		JCheckBox pear =new JCheckBox("배",true);
		JCheckBox cherry =new JCheckBox("체리",a);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(b);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_4();
	}
}
