import java.lang.*;
public class Student
{
	private String name;
	private String studentID;
	private String major;
	private double cgpa;
	private short creditCompleted;
	private String email;
	
	public Student()
	{
		
	}
	public Student(String name, String studentID, String major, double cgpa, short creditCompleted, String email)
	{
		this.name = name;
		this.studentID = studentID;
		this.major = major;
		this.cgpa = cgpa;
		this.creditCompleted = creditCompleted;
		this.email = email;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setStudentID()
	{
		this.studentID = studentID;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public void setCreditCompleted(short creditCompleted)
	{
		this.creditCompleted = creditCompleted;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getName()
	{
		return this.name;
	}
	public String getStudentID()
	{
		return this.studentID;
	}
	public String getMajor()
	{
		return this.major;
	}
	public double getCgpa()
	{
		return this.cgpa;
	}
	public short getCreditCompleted()
	{
		return this.creditCompleted;
	}
	public String getEmail()
	{
		return this.email;
	}
	public boolean isEligibleForDeanList()
	{
		if(this.cgpa >=3.7 && this.creditCompleted>= 30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void showDetails()
	{
		System.out.println("Name: " +this.name);
		System.out.println("Student ID: " +this.studentID);
		System.out.println("Major: " +this.major);
		System.out.println("CGPA: " +this.cgpa);
		System.out.println("Credit Completed: " +this.creditCompleted);
		System.out.println("Email: " +this.email);
		//System.out.println("Is Eligible For Dean List: " +this.isEligibleForDeanList());
	}
	
}