package polymorphism;

public class area {
	
	void area(int side) {
		System.out.println("Area of Square is "+(side*side));
	}
	void area(int radius,float pi) {
		System.out.println("Area if circle is "+(2*pi*radius));
	}
	void area(int length,int width) {
		System.out.println("Area if Rectangle is "+(length*width));
	}
	void area(float pi,int radius,int height) {
		System.out.println("Area if cylinder is "+(2*pi*radius*height));
	}

	public static void main(String[] args) {
		area A=new area();
		A.area(5);
		A.area(10, 3.14f);
		A.area(10, 20);
		A.area(3.14f, 10, 10);

	}

}
