package java0611;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
public class Java0611_4 extends JFrame{
	public Java0611_4(){
		super("üũ�ڽ� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon a = new ImageIcon("images/a.png");
		ImageIcon b = new ImageIcon("images/b.png");
		JCheckBox apple =new JCheckBox("���");
		JCheckBox pear =new JCheckBox("��",true);
		JCheckBox cherry =new JCheckBox("ü��",a);
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
