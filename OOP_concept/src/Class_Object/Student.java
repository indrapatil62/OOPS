package Class_Object;

public class Student {

	int RollNo,contact_No;
	String FName,LName,EmailId;
	float Precentage; 
	
	public static void main(String[] args) {
		Student S1=new Student();
		S1.RollNo=21;
		S1.contact_No=1234567890;
		S1.FName="Indrajeet";
		S1.LName="Patil";
		S1.EmailId="indrapatil@gmail.com";
		S1.Precentage=82.05f;
	
		System.out.println(S1.FName+" "+S1.LName);

	}

}
