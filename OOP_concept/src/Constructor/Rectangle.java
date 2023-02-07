package Constructor;

public class Rectangle {
	
	int length;
	int width;
	
	public Rectangle(){
		this.length=50;
		this.width=20;		
	}
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public void area() {
		System.out.println("Area of rectangle = "+this.length*this.width);
	}
	public void Perimeter() {
		System.out.println("Perimeter of rectangle = "+(2*(this.length+this.width)));
	}

	public static void main(String[] args) {
		Rectangle Rect=new Rectangle();
		Rect.area();
		Rect.Perimeter();

	}

}
