import java.lang.*;

public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
	public Student()
	{
		
	}
	public Student(int id, String name, double cgpa)
	{
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public int getId(int id)
	{
		return this.id;
	}
	public String getName(String name)
	{
		return this.name;
	}
	public double getCgpa(double cgpa)
	{
		return this.cgpa;
	}
	
	public void showDetails()
	{
		System.out.println("Student ID : "+this.id);
		System.out.println("Student Name : "+this.name);
		System.out.println("Student CGPA : "+this.cgpa);
	}

	public static void main(String [] args)
	{
		Student student = new Student(2456, "Ankur Basak", 3.66);
		System.out.println("Student Information : ");
		student.showDetails();
	}
}