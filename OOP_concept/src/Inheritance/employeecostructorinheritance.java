package Inheritance;

class Members{
		String name,address;
		int Age,phone_no,salary;
		
		public Members(String name,String address,int Age,int phone_no,int salary)
		{
			this.name=name;
			this.address=address;
			this.Age=Age;
			this.phone_no=phone_no;
			this.salary=salary;
		}
		void printSalary() {
			System.out.println(name+" "+address+" "+Age+" "+phone_no+" "+salary);
		}
	}
	
	class Employees extends Members{
		String Specialization;
	
		public Employees(String name,String address,int Age,int phone_no,int salary,String Specialization) {
			super(name,address,Age,phone_no,salary);
			this.Specialization=Specialization;
		}
		void display() {
			System.out.println(name+address+Age+" "+phone_no+" "+salary+" "+Specialization);
		}
	}
	class Managers extends Members{
		String Department;
		public Managers(String name,String address,int Age,int phone_no,int salary,String Department) {	
			super(name,address,Age,phone_no,salary);
			this.Department=Department;}
		void show() {
			System.out.println(name+address+Age+" "+phone_no+" "+salary+" "+Department);
		}
	}
public class employeecostructorinheritance {

	public static void main(String[] args) {
		Employees E=new Employees("Rahul ","Pune ", 20, 12356890, 50000, "Java devop");
		E.display();
		Managers M =new Managers("Rohan ","Pune ", 30, 1235688790, 60000, "Devop");
		M.show();
	}

}
