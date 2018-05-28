package day0528;
class Shape{
	protected String name;
	public void paint(){
		draw();
	}
	public void draw(){
		System.out.println(name);
	}
}

public class _day0528_6 extends Shape{
	protected String name;
	public void draw(){
		name="Circle";
		super.name="Shape";
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new _day0528_6 ();
		s.paint();
	}

}
