package Inheritance;
class Rectangle1{
	protected int length;
	protected int breadth;
	
	public Rectangle1(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void Area() {
		System.out.println("Area of rectangle is "+(this.length*this.breadth));
	}
	public void perimeter() {
		System.out.println("Perimeter of rectangle is "+2*(this.length+this.breadth));
	}
}
class Square1 extends Rectangle1{

	int Side;
	
	public Square1(int length,int breadth, int Side) {
		super(length,breadth);
		super.length=10;
		super.Area();
		
		this.Side=Side;
	}
	public void Area_sq() {
		System.out.println("Area of Sqaure is "+(this.Side*this.Side));
	}
	public void perimeter_sq() {
		System.out.println("Perimeter of Square is "+4*this.Side);
	}	
}
public class constructor {

	public static void main(String[] args) {
		Square1 S=new Square1(10,15,5);
		S.Area_sq();
		S.perimeter_sq();
		S.Area();
		S.perimeter();

	}

}
