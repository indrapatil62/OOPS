package FinalKeyword;

public class FinalMethod {
	final void method() {
		System.out.println("Final methods are cannots be overrided");
	}

	public static void main(String[] args) {
		FinalMethod f=new FinalMethod();
		f.method();

	}

}
