package Class_Object;

public class Bank {
	
	String Bank_name,Customer_Name,Branch;
	String IFSC_Code,MICR_Code;
	String Account_No;
	

	public static void main(String[] args) {
		Bank S1=new Bank();
		S1.Bank_name="Bank of India";
		S1.Customer_Name="Indrajeet Patil";
		S1.Branch="Pune";
		S1.IFSC_Code="BOI1234";
		S1.MICR_Code="QWER1234";
		S1.Account_No="123456789012";
		
		System.out.println(S1.Customer_Name);

	}

}
