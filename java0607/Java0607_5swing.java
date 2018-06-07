package java0607;
import javax.swing.*;
import java.awt.*;
public class Java0607_5swing extends JFrame{
	public Java0607_5swing(){
		super("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(null);//컨텐트팬의 배치관리자 제거
		
		JLabel la=new JLabel("Hello, press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		cp.add(la);//la를 컨텐트팬에 부착
		for(int i=0;i<=9;i++){//9개의 버튼 컴포넌트 동일한 크기로 생성 , 위치 다르게
			JButton b= new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);//버튼의 위치 설정
			b.setSize(50,20);//버튼크기 50*20
			cp.add(b);//버튼을 컨텐트팬에 부착
		}
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java0607_5swing();
	}

}
