package agrreagationType;
 class Car {
	   //engine is a mandatory part of the car
	   private final Engine engine;

	   public Car () {
	      engine = new Engine();
	      System.out.println("hiii");
	   }
	}

	//Engine Object
	class Engine {}

public class Composition
{

	public static void main(String[] args)
	{
		Car c=new Car();

	}

}
