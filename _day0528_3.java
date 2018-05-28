package day0528;
class Point{
	private int x,y;
	public void set(int x,int y){
		this.x=x;this.y=y;
	}
	public void showPoint(){
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point {
	private String color;
	public void setcolor(String color){
		this.color=color;
	}
	public void showcolorPoint(){
		System.out.print(color);
		showPoint();
	}
}
	public class _day0528_3{
		public static void main(String[] args){
			Point p=new Point();
			p.set(1, 2);
			p.showPoint();
			
			ColorPoint cp= new ColorPoint();
			cp.set(3, 4);
			cp.setcolor("red");
			cp.showcolorPoint();
			
		}
	}

