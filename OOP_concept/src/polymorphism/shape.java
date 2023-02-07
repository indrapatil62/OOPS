package polymorphism;

public class shape {
	int length,width,side,hieght,radius	;


	public shape(int side) {
		System.out.println("Area of Square is "+(side*side));
	}
	public shape(int length,int width) {
		System.out.println("Area of Rectangle is "+(length*width));
	}
	static void shape(int radius) {
		System.out.println("Area of Circle is "+(2*3.14*radius));
	}
	static void shape(int side,int height) {
		System.out.println("Area of Triangle is "+(side*height)/2);
	}

	public static void main(String[] args) {
		shape S=new shape(10);
		shape S1=new shape(10,20);
		S.shape(10);
		S.shape(10, 15);

	}

}
