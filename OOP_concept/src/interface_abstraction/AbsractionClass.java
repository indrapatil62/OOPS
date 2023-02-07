package interface_abstraction;

abstract class Student{
	final int i=9;
	abstract void school();       //only public and protected ,default allow 
	void College()
	{
		System.out.println("hello");
	}
}

class T extends Student{

	@Override
	void school() {
		System.out.println(i);
		System.out.println("hii");
		
	}
	
}

public class AbsractionClass {

	public static void main(String[] args) {
		T t=new T();
		t.College();
		t.school();
	}

}
