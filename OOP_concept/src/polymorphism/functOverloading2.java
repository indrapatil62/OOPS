package polymorphism;

import java.util.Scanner;

public class functOverloading2 {
	double PA;
	int fy;
	float roi;
	void functOverloading2(int fy) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle ammount ");
		PA=sc.nextDouble();
		System.out.println("Enter Rate of interst ");
		roi=sc.nextFloat();
		
		System.out.println("\nSimple interest is "+(PA*(1+roi*fy))/100);
	}
	
	void functOverloading2(float roi) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Principle ammount ");
		PA=sc.nextDouble();
		System.out.println("Enter years ");
		fy=sc.nextInt();
		
		System.out.println("\nSimple interest is "+(PA*(1+roi*fy))/100);
	}
	
	void functOverloading2(int fy,float roi) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Principle ammount ");
		PA=sc.nextDouble();
			
		System.out.println("\nSimple interest is "+(PA*(1+roi*fy))/100);
	}

	public static void main(String[] args) {
		functOverloading2 F=new functOverloading2();
		F.functOverloading2(5);
		F.functOverloading2(3);
		F.functOverloading2(2,6);

	}

}
