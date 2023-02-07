package interface_abstraction;

import polymorphism.shape;

interface Shape{
	void getArea();
	void getPerimeter();
}

class Circle implements Shape{
	int radius =10;
	double pi=3.14;
	@Override
	public void getArea() {
		System.out.println("Area of Circle is :"+(2*pi*radius));	
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is :"+(pi*radius*radius));	
	}
	
}
class Rectangle implements Shape{
	int len =10;
	int wid=20;
	@Override
	public void getArea() {
		System.out.println("Area of Rectangle is :"+(len*wid));	
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle is :"+2*(len+wid));
	}
}
public class Interface_example {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle R=new Rectangle();
		shape s;
		c.getArea();
		c.getPerimeter();
		R.getArea();
		R.getPerimeter();
		

	}

}
