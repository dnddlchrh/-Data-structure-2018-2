package java0601;
class Circle{
	int x;
	int y;
	int radius;
	public Circle(int x,int y,int radius ){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public boolean equals(Circle a){
		if(this.x==a.x&&this.y==a.y)
			return true;
		return false;
		}
	public String toString(){
		return "Circle ("+x+","+y+")������"+radius;
	} 
}
public class Java0601_1 {
	void play(){
		Circle a= new Circle(2,3,5);
		Circle b= new Circle(2,3,30);
		System.out.println("�� a : "+a.toString());
		System.out.println("�� b : "+b.toString());
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java0601_1 play=new Java0601_1();
		play.play();
	}

}
