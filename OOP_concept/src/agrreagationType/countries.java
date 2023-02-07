package agrreagationType;

import java.util.Scanner;

public class countries {
	String countryName;
	sportPerson sp;
	public countries() {
	sportPerson sp=new sportPerson();
	Scanner sc=new Scanner(System.in);
	System.out.println("Name of country is ");
	countryName=sc.next();
	System.out.println("Enter Sport Person Name is ");
	sp.setname(sc.next());
	System.out.println("Enter Sport Name is ");
	sp.setSport(sc.next());
	System.out.println("Enter Captain Name is ");
	sp.setCaptainName(sc.next());
	System.out.println("Enter Review for player is ");
	sp.setReview(sc.nextInt());
	this.sp=sp;
	sc.close();
	}
	void display() {
		System.out.println("\n\nCountry name is "+countryName);
		System.out.println("Sport Person name is "+this.sp.name);
		System.out.println("Game is "+this.sp.sport);
		System.out.println("Caption of team is "+this.sp.captainName);
		System.out.println("Get review for person is "+this.sp.review+"\n\n");	
	}


	public static void main(String[] args) {
		countries c1=new countries();
		c1.display();
		countries c3=new countries();
		c3 .display();
	

	}

}
