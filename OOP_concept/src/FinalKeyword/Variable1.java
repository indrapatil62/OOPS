package FinalKeyword;

public class Variable1 {
	final int a=100;  
	void Variable1() {
		System.out.println(a);
		System.out.println("It is first method of declaring final keyword at a time of declaration");
	}

	public static void main(String[] args) {
		Variable1 V =new Variable1();
	//	V.a=200;  we cannot change the value of final variable
		V.Variable1();
	}

}
