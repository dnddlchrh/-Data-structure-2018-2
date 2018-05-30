package day0530;
class Point{
	protected int x;
	protected int y;
	protected String color;
	public void play(){
		draw();
	}
	public void draw(){
		System.out.println(color+"���� ("+x+","+y+")�� ���Դϴ�.");
	}
}
public class ColorPoint extends Point {
	protected int x;
	protected int y;
	protected String color;
	public void draw(){
		color="RED";
		x=5;y=5;
		super.color="BLACK";
		super.draw();
		System.out.println(color+"���� ("+x+","+y+")�� ���Դϴ�.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new ColorPoint();
		
		p.play();
	}

}
