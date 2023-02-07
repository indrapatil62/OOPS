package Inheritance;

class Parent {

	void display() {
		System.out.println("This is parent class");
	}
}

class child extends Parent{
	void display_sub() {
		System.out.println("This is child class");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Parent P=new Parent();
 
		child C=new child();
		C.display_sub();
		C.display();

	}
}

