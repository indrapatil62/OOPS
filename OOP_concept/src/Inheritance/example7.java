package Inheritance;
class person{
	String Name;
	int Age;
	
	public person(String Name,int Age)
	{
		this.Age=Age;
		this.Name=Name;
	}
}
class Employes extends person{
	int workHour;
	double totalPay;
	private int Id;
	private int hourlyPay;
	public Employes(String Name,int Age)
	{
		super(Name,Age);
	}
	
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public void setId(int id) {
		Id = id;
	}
	public void sethourlyPay(int  hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	public int  getHourlyPay() {
		return hourlyPay;
	}
	public int getId() {
		return Id;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void getRaise() {
		totalPay=workHour*(getHourlyPay()*1.15f);
		System.out.println("Weekly pay of an Employee is "+totalPay);
	}
	public void payDay() {
		if (workHour<=40) {
			System.out.println("\nNormal Pay week, your payment for week is "+totalPay);
		}
		else if (workHour>40) {
			System.out.println("\nYour payment for week is "+(totalPay+(workHour-40)*(hourlyPay*1.5)));
			System.out.println("Your Overtime hours are "+(workHour-40)+" hours."); 
			System.out.println("Your Overtime Allowance is "+(workHour-40)*(hourlyPay*1.5));
		}
	}
}
public class example7 {

	public static void main(String[] args) {
		Employes Emp=new Employes("Indra", 25);
		Emp.sethourlyPay(150);
		Emp.setWorkHour(50);
		Emp.getRaise();
		Emp.payDay();

	}

}
