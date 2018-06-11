package java0611;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Java0611_2 extends JFrame{
	public Java0611_2(){
		super("레이블");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel=new JLabel("사랑합니다");
		ImageIcon beauty = new ImageIcon("C:/Users/emt00/workspace/java0611/images/beauty.png");
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("C:/Users/emt00/workspace/java0611/images/normalIcon.png");
		JLabel label = new JLabel("보고싶으면 전화하세요",normalIcon,SwingConstants.CENTER);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_2();
	}
}
