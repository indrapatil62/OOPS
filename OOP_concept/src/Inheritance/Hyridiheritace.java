package Inheritance;
class shape{
	void Display(){
		System.out.println("This is shape");
	}
}

class Rectagle extends shape{
	void DisplayR(){
		System.out.println("This is Rectagle");
	}
}

class circle extends shape{
	void Displayc(){
		System.out.println("This is circle");
	}
}

class square extends Rectagle{
	public void DisplayS(){
		//super.Display();
		//super.DisplayR();
		System.out.println("Square is Rectagle");
	}
}
public class Hyridiheritace {

	public static void main(String[] args) {
		square S =new square();
		S.Display();
		S.DisplayR();

	}

}
