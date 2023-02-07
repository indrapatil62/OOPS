package Inheritance;

	class Member{
		String name,address;
		int Age,phone_no,salary;
		
		void setInfo(String name,String address,int Age,int phone_no,int salary)
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
	
	class Employee extends Member{
		String Specialization;
	
		void setInfo(String Specialization) {
			this.Specialization=Specialization;
		}
		void display() {
			System.out.println(Specialization);
		}
	}
	class Manager extends Employee{
		String Department;
		void setInfo(String Department) {	
			this.Department=Department;}
		void show() {
			System.out.println(Department);
		}
	}

public class example {

	public static void main(String[] args) {
		/*Member E=new Member();
		E.setInfo("Indra", "Pune", 24, 1234567788, 50000);
		E.printSalary();*/
		Employee E=new Employee();
		E.setInfo("Java Devop");
		E.display();
		Manager M=new Manager();
		M.setInfo("Rahul", "Mumbai", 30, 1233345567, 0);
		M.printSalary();
		M.setInfo( "Devop");
		M.show();
	}

}
