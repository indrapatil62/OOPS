package Class_Object;

public class Area_withType {

		void area_of_circle() {
		
		System.out.println("Area of circle is ="+(3.14f*10*10));
	}
			
		// Function With return and with No Para
		float Area_2() {
			System.out.println("Area of circle ->");
			return (float) (3.14*(Math.pow(10, 2)));
		}
		
		// Function With no return and with Para
		
		void Area_3(int Radius) {
			System.out.println("Area of circle \n");
			System.out.print(3.14*(Math.pow(Radius, 2)));
		}
		
		// Function With return and with Para
		float Area(int Radius) {
			System.out.println("Area of circle :");
			return (float) (3.14f*(Math.pow(Radius, 2)));
			
		}

	public static void main(String[] args) {
		Area_withType A=new Area_withType();
		
		A.area_of_circle();
		System.out.println(A.Area(10));
		A.Area_2();
		A.Area_3(10);
		
	}

}
