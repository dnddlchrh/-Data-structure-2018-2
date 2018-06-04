package java0604;
import java.util.*;
public class Java0604_5 {
	class Line extends Java0604_5Shape{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("Line");
		}
		
	}
	class Rect extends Java0604_5Shape{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("Rect");
		}
		
	}
	class Circle extends Java0604_5Shape{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("Circle");
		}
		
	}
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Vector<Java0604_5Shape> v=new Vector<Java0604_5Shape>();
		sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true){
			
		}
	}

}
