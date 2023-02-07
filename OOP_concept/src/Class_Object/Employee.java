package Class_Object;

public class Employee {

	String company_name,Emp_id,Employee_Name;
	int Date_of_joining;
	String Designation,Blood_group;

	public static void main(String[] args) {
		Employee S1=new Employee();
		S1.company_name="Itpreneur.pvt.ltd";
		S1.Employee_Name="Indrajeet Patil";
		S1.Emp_id="ITP101";
		S1.Date_of_joining=10-12-2022;
		S1.Designation="Java Devoloper";
		S1.Blood_group="B+ve";
		
		System.out.println(S1.company_name);

	}

}
