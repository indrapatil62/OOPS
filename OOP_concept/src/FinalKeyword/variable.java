package FinalKeyword;

public class variable {
	static final int z;
	static{
		z=10;
		System.out.println("1 IIB ");
	
	}
	static void show(){
		System.out.println("3 This is static block");
	}
	public variable() 
	{
//		z=200;
		System.out.println("2 Default constructor ");
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		variable v=new variable();
		v.show();
		

	}

}
