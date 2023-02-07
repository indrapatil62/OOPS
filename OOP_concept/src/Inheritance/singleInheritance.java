package Inheritance;

import java.util.Scanner;

class circle1{
	int dia;
	
	public circle1(int dia) {
		this.dia=dia;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Diameter ");
		this.dia=sc.nextInt();
	}
	void Display(){
		System.out.println("Area of circle is "+(3.14*this.dia));
	}
}

class cylinder1 extends circle1{
	int len;
	public cylinder1(int dia,int len){
		super(dia);
		this.len=len;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of cylinder ");
		this.len=sc.nextInt();
	}
	void Dis() {
		System.out.println("Area of cylinder is "+(3.14*this.dia*this.len));
	}
}
public class singleInheritance {

	public static void main(String[] args) {
		cylinder1 c=new cylinder1(0, 0);
		c.Dis();
		c.Display();

	}

}
