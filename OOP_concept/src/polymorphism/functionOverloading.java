package polymorphism;

public class functionOverloading {
	void functionOverloading(int a ,int b) {
		System.out.println(" Addition of two number is "+(a+b));
	}
	void functionOverloading(float a ,float b) {
		System.out.println(" Addition of two number is "+(a+b));
	}
	void functionOverloading(double a ,double b) {
		System.out.println(" Addition of two number is "+(a+b));
	}

	public static void main(String[] args) {
		functionOverloading F=new functionOverloading();
		F.functionOverloading(10.5, 20.5);
		F.functionOverloading(1.3f,3.4f);
		F.functionOverloading(10, 20);
	}

}
