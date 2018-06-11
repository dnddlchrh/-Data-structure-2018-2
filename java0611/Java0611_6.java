package java0611;
import java.awt.*;
import javax.swing.*;
public class Java0611_6 extends JFrame{
	public Java0611_6(){
		super("라디오 버튼 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon a = new ImageIcon("images/a.png");//해제상태
		ImageIcon b = new ImageIcon("images/b.png");//선택상태
		
		ButtonGroup g=new ButtonGroup();
		JRadioButton apple=new JRadioButton("사과");
		JRadioButton pear=new JRadioButton("배",true);
		JRadioButton cherry=new JRadioButton("체리",a);
		cherry.setBorderPainted(true);//이미지 라디오버튼의 외곽선 출력
		cherry.setSelectedIcon(b);//선택 상태 이미지 등록
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0611_6();
	}
}
